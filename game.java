/**
 * This is a simple tic tac toe game that is played in the terminal. The first
 * player has to place "O" and the second player has to place "X". The goal of
 * the game is to get three of your symbols in a row, either horizontally,
 * vertically, or diagonally. The first player to get three in a row wins.
 * If all of the spaces on the board are filled and no one has won, the game
 * is a draw.
 *
 * @author Quentin Radlo
 */
 import java.util.*;
public class game{

	public static void main(String args[]){
		game();
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
			input_int = Integer.parseInt(input);
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
	/**
	 * Will replace the value in the array, situated at the row 'row', and the place 'index'
	 * @param a type GridInfo that holds the grid we are working with
	 * @param a int row, which tells which row we want to change
	 * @param a int index which tells where we change the value
	 * @param a int value, which is the value that will replace the one held in the array
	 * @return a GridInfo which now contains a new two dimensional array
	 */
	static GridInfo insertValueInGrid(GridInfo gameGrid, int row, int index, int value){
		gameGrid.gridArray[row][index] = value;
		return gameGrid;
	}
	/**Checks is the array is empty at the specified array position
	 * @return true if empty, false otherwise
	 */
	static boolean isArrayEmpty(GridInfo gameGrid, int row, int index){
		boolean empty;
		if (gameGrid.gridArray[row][index] == 0){
			System.out.println("Is empty !");
			empty = true;
		}
		else{
			System.out.println("Not empty!");
			empty = false;

		}

		return empty;
	}
	
	static GridInfo arrayPlacement(GridInfo gameGrid, int user_number){
		int row = GetUserInput();
		int index = GetUserInput();
		row --;
		index--;
		while(isArrayEmpty(gameGrid, row, index) == false){
			System.out.println("Something is already placed at this location");
			row = GetUserInput(); 
			index = GetUserInput();
			row --;
			index --;

			}	
		gameGrid.gridArray[row][index] = user_number;
		return gameGrid;
	}
	
	static boolean victoryCheck(GridInfo gameGrid, int player_index){
		boolean victory = false;
		
		//We check in the rows
		for(int i = 0; i < 3; i++){
			if ((gameGrid.gridArray[i][0] == player_index) && (gameGrid.gridArray[i][1] == player_index) && (gameGrid.gridArray[i][2] == player_index)){
				victory = true;
			}

		}
		//We check in the columns
		for(int i = 0; i < 3; i++){
			if ((gameGrid.gridArray[0][i] == player_index) && (gameGrid.gridArray[1][i] == player_index) && (gameGrid.gridArray[2][i] == player_index)){
				victory = true;
			}

		}
		//We check in the diagonal
			if ((gameGrid.gridArray[0][0] == player_index) && (gameGrid.gridArray[1][1] == player_index) && (gameGrid.gridArray[2][2] == player_index)){
				victory = true;
			}
		return victory;
	}

	static void game(){
		GridInfo gameGrid = new GridInfo();
		int counter = 0;
		int row;
		int index;
		boolean victory = false;
		printGrid(gameGrid);
		while(victory == false){
			counter ++;
			do{
				System.out.print("Player 1 : \nInput an int for the row\n");
				row = GetUserInput();
				System.out.print("Player 1 : \nInput an int for the column\n");
				index = GetUserInput();
				row --;
				index --;
			} while(isArrayEmpty(gameGrid, row, index) == false);

			insertValueInGrid(gameGrid, row, index, 1);
			printGrid(gameGrid);

			if (victoryCheck(gameGrid, 1) == true){  

				victory = true;
			}
			else{
				counter ++;
				if (counter >= 9){
					victory = true;
				}
				else{
					do{
						System.out.print("Player 2 : \nInput an int for the row\n");
						row = GetUserInput();
						System.out.print("Player 2 : \nInput an int for the column\n");
						index = GetUserInput();
						row --;
						index --;
					} while(isArrayEmpty(gameGrid, row, index) == false);

					insertValueInGrid(gameGrid, row, index, 2);
					printGrid(gameGrid);
				}
			}
			if (victoryCheck(gameGrid, 2) == true){  

				victory = true;
			}
			else if (counter >= 9){
				victory = true;
			}
			
		} 
		if(victoryCheck(gameGrid, 1) == true){
			System.out.println("Player 1 won !");
		} 
		else if(victoryCheck(gameGrid, 2) == true){
			System.out.println("Player 2 won !");
		} 
		else{
			System.out.println("Draw !");
		} 
	}
}

