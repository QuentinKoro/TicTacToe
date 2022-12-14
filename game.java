import java.util.*;
public class game{

	public static void main(String args[]){
	
		/**
		System.out.println("Testing");
		int[] row0 = new int [3];
		int[] row1 = new int [3];
		int[] row2 = new int [3];
		changeRow(row0, 0, 1);
		changeRow(row0, 1, 15);
		changeRow(row0, 2, 3);
		GetUserInput();
		*/

		Grid jeu = new Grid();

		System.out.println("\nAvant changement\n");
		System.out.println("\nArray 0 :\n");
		System.out.println(jeu.row0[0]);
		System.out.println(jeu.row0[1]);
		System.out.println(jeu.row0[2]);
		System.out.println("\nArray 1 :\n");
		System.out.println(jeu.row1[0]);
		System.out.println(jeu.row1[1]);
		System.out.println(jeu.row1[2]);
		System.out.println("\nArray 2 :\n");
		System.out.println(jeu.row2[0]);
		System.out.println(jeu.row2[1]);
		System.out.println(jeu.row2[2]);

		valueInArray(jeu, 0, 0, 0);
		changeValueArray(jeu, 0, 0, 443);

		valueInArray(jeu, 0, 0, 0);
		valueInArray(jeu, 0, 0, 443);
		System.out.println("\nApres changement\n");
		System.out.println("\nArray 0 :\n");
		System.out.println(jeu.row0[0]);
		System.out.println(jeu.row0[1]);
		System.out.println(jeu.row0[2]);
		System.out.println("\nArray 1 :\n");
		System.out.println(jeu.row1[0]);
		System.out.println(jeu.row1[1]);
		System.out.println(jeu.row1[2]);
		System.out.println("\nArray 2 :\n");
		System.out.println(jeu.row2[0]);
		System.out.println(jeu.row2[1]);
		System.out.println(jeu.row2[2]);
		changeValueArray(jeu, 0, 0, 2);
		placeValueInArray(jeu);

	}
	//Class grid which contains every list for every row
	static class Grid{

		int[] row0 = new int [3];
		int[] row1 = new int [3];
		int[] row2 = new int [3];
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

		//Changes input(a string), to an int 	
		return input_int;

	}
	/**
	 * @param An array to change
	 * @param A int index which represents the place of the array to change
	 * @param A int, which will replace the value sitting at index place
	 * @return The inputList with value at the index place
	 */
	static int[] changeRow(int[] inputArray, int index, int value){

		switch(index){

			case 0:
				inputArray[index] = value;
				break;

			case 1:
				inputArray[index] = value;
				break;

			case 2:
				inputArray[index] = value;
				break;
		}

		return inputArray;	
	}	
	static Grid changeValueArray(Grid gameGrid, int ArrayToChange, int index, int value){
		switch(ArrayToChange){
			case 0:
				changeRow(gameGrid.row0, index, value);
				break;

			case 1:
				changeRow(gameGrid.row1, index, value);
				break;

			case 2:
				changeRow(gameGrid.row2, index, value);
				break;
		}
		return gameGrid; 
	}
	//Checks if the value "value" is at the place of index in the array selected 
	static boolean valueInArray(Grid gameGrid, int ArrayToChange, int index, int value){
		boolean valueIn = false;
		switch(ArrayToChange){
			case 0:
				if (gameGrid.row0[index] == value){
					System.out.println("It is true");}
					valueIn = true;
				break;

			case 1:
				if (gameGrid.row1[index] == value){
					valueIn = true;
				}
				break;

			case 2:
				if (gameGrid.row2[index] == value){
					valueIn = true;
				}
				break;
		}
		return valueIn;
	}

	//Places a value in the arrays
	static Grid placeValueInArray(Grid gameGrid){
		//Getting value from user
		System.out.println("\nSetting an x\n");
		int x = GetUserInput();
		System.out.println("\nSetting an y\n");
		int y = GetUserInput();
		//We check if there is already a value where the user wants to go
		//If there is we make the user change it until it's good
		while((valueInArray(gameGrid, y, x, 1) || (valueInArray(gameGrid, y, x, 2)))){
			System.out.println("\nError there is already a value there, please try again somewhere else\n");		
			System.out.println("\nSetting an x\n");
			x = GetUserInput();
			System.out.println("\nSetting an y\n");
			y = GetUserInput();
		}
		return gameGrid;
		}
}
