import java.util.*;
public class game{

	public static void main(String args[]){

		GridInfo gridTest = new GridInfo();
		gridTest.gridArray[1][2] = 1;
		gridTest.gridArray[1][0] = 1;
		gridTest.gridArray[0][2] = 2;
		gridTest.gridArray[2][2] = 1;
		gridTest.gridArray[0][1] = 1;
		gridTest.gridArray[1][0] = 2;
		printGrid(gridTest);
	}
	//Class grid which contains every list for every row
	static class GridInfo{
		int[][] gridArray = new int[3][3];
	}
	/**
	 * @param None
	 * @return an integer smaller or = 1 || <= 3 from user input
	 */	
	static int GetUserInput(){
		int input_int = 0;
		Scanner in = new Scanner(System.in);

		//Get input from the user
		System.out.println("\nEnter a number\n");
		String input = in.nextLine();

		input_int = Integer.parseInt(input);
		//We get another input if it is incorrect
		while((input_int > 3) ){

			System.out.println("\nInvalid input please enter a valid number\n");
			input = in.nextLine();
		}

		//Changes input(a string), to an int 	
		return input_int;

	}
	/** 
	 * A terminal displays, which displays nothing if the input arrays are at 0, display
	 * a O 1 if value is at 1, or a X if it is 2
	 * @param A GridInfo type which will contain the array we will print
	 */
	static void printGrid(GridInfo gameGrid){
		System.out.print("0 | 1 | 2 | 3 |\n");
		for(int i = 0; i < 3; i++){
			System.out.print(i + 1);
			System.out.print(" | ");
			for (int j = 0; j < 3; j++){
				//System.out.println(gameGrid.gridArray[i][j]);
				if ((gameGrid.gridArray[i][j]) == 0){
					System.out.print(" ");

				}
				else if (gameGrid.gridArray[i][j] == 1){
					System.out.print("O");
				}
				else if (gameGrid.gridArray[i][j] == 2){
					System.out.print("X");
				}	
				else if (gameGrid.gridArray[i][j] > 2){
					System.out.println("Fatal error, value in array is > to 2");
					
				}
				
				System.out.print(" | ");
			}
			//We're at the end of the line here while printing so we change the line
			System.out.println("");
		}
	}
}
