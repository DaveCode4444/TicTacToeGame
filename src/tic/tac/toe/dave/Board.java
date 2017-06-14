package tic.tac.toe.dave;

public class Board {
	
	private String[][] board;
	
	public Board(String[][] board) {
		this.board = board;
	}
	
	public String[][] getBoard() {
		return board;
	}
	
	//this method will terminate the program after a player has won
	public static void endGame(String[][] board){
		System.out.println("Thank you for playing");
		System.out.println("*****End of Game*****");
		System.exit(0);
	}

	// this is a static method that checks for both players if they have won
	public static void checkDiagonal(String[][] board,Player player){
		String marker = player.getMarker();
		
		if(marker.equals(board[0][0]) && marker.equals(board[1][1]) && marker.equals(board[2][2])){
			System.out.println(player.getName()+" is the winner");
			endGame(board);
		}else if(marker.equals(board[2][0]) && marker.equals(board[1][1]) && marker.equals(board[0][2])){
			System.out.println(player.getName()+ " is the winner");
			endGame(board);
		}
	}
	
	//this method checks if player has won
	public void checkIfPlayerIsWinner(String[][] board,Player player){
		String marker = player.getMarker();
		int count = 0;
		
		//checks for horizontal
		for(int i=0;i<board.length;i++){
			count = 0;
			for(int j=0;j<board.length;j++){
				if(marker.equals(board[i][j])){
					count++;
					continue;
				}else{
					break;
				}
			}
			if(count == 3){
				System.out.println(player.getName()+" is the winner");
				endGame(board);
			}
		}
		
		//check for vertical
		for(int i=0;i<board.length;i++){
			count = 0;
			for(int j=0;j<board.length;j++){
				if(marker.equals(board[j][i])){
					count++;
					continue;
				}else{
					break;
				}
			}
			if(count == 3){
				System.out.println(player.getName()+" is the winner");
				endGame(board);
			}
		}
		
		//this method call will check for diagonals
		checkDiagonal(board, player);
		
	}
	
	//this method displays the board after each players turn
	public void displayBoard(String[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	
	

}
