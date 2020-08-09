package chess;

import boardgame.Board;
import boardgame.Piece;

//When changed Piece for abstract this extends class has been failed 
//then changed this class to abstract yet
public abstract class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
}
