import java.util.*;
public class game{

	public static void main(String args[]){
	
		System.out.println("Testing");
		//Grid newgrid = new Grid();
		int[] row0 = new int [3];
		int[] row1 = new int [3];
		int[] row2 = new int [3];
		GetUserInput();
	}
	/**
	 * @param None
	 * @return an integer >= 1 || <= 3 from user input
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

		//Changes input, to int 
		
		System.out.println(input_int);
		return input_int;

	}



}
