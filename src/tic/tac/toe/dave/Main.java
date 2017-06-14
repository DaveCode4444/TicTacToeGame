package tic.tac.toe.dave;

import java.util.Scanner;

public class Main {
	
	public static void takeInputFromPlayer1(String[][] board,Player player,Scanner sc){
		System.out.print(player.getName()+" enter your x and y coordinates");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int returnValue = player.play(x, y, board);
		if(returnValue == 0 || returnValue == -1){
			takeInputFromPlayer1(board, player,sc);
		}
	}
	
	public static void takeInputFromPlayer2(){
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Create Board
		String[][] playBoard = new String[3][3];
		Board board = new Board(playBoard);
		
		
		//Enter Player Names
		System.out.println("****Welcome to Tic tac Toe--->Created By Devang Sawant*****");
		System.out.print("Player 1 enter your name: ");
		String player1Name = sc.next();
		System.out.print("Player 2 enter your name: ");
		String player2Name = sc.next();
		
		//Player Objects created
		Player player1 = new Player(player1Name);
		Player player2 = new Player(player2Name);
		
		//Players Choose Markers
		System.out.print(player1Name+" Select your marker(You can select either + or 0): ");
		String marker1 = sc.next();
		player1.choose(marker1);
		System.out.print(player2Name+" Select your marker(You can select either + or 0): ");
		String marker2 = sc.next();
		player2.choose(marker2);
		
		//Start Game
		int counter = 0;
		String[][] gameBoard = board.getBoard();
		
		
		while(counter<9){
			takeInputFromPlayer1(gameBoard, player1,sc);
			counter++;
			board.displayBoard(gameBoard);
			if(counter>4){
				board.checkIfPlayerIsWinner(gameBoard, player1);
			}
			
			
			takeInputFromPlayer1(gameBoard, player2,sc);
			counter++;
			board.displayBoard(gameBoard);
			if(counter>4){
				board.checkIfPlayerIsWinner(gameBoard, player2);
			}
			
		}
		System.out.println("*****End of Game*****");
		sc.close();
		
		
	}
	
	
	
	
}
