package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece (Board board) {
		this.board = board;
		position = null; //This is not necessary just to show field value 
		
	}
	
	protected Board getBoard() {
		return board;
	}
		
}
