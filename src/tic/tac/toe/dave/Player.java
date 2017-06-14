package tic.tac.toe.dave;

public class Player {
	
	
	private String name;
	private String marker;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getMarker() {
		return marker;
	}
	
	// this method chooses marker for the player i.e. either + or 0
	public void choose(String markerChose){
		this.marker = markerChose;
		System.out.println("Player "+this.name+ " has chose "+this.marker);
	
	}
	
	//this method places marker at x and y coordinate for the player
	public int play(int x,int y,String[][] board){
		if(x < 0 || x > 2 || y < 0 || y > 2 ){
			System.out.println("Invalid coordinates: Please re-enter correct coordinates");
			return 0;
		}else if(board[x][y] == null){
			board[x][y] = this.marker;
			return 1;
		}
		System.out.println("Invalid coordinates: Please re-enter correct coordinates");
		return -1;
			
	}
	

}
