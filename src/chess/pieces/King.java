package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	public String toString () {
		return "K";
	}
	@Override
	public boolean[][] possibleMoves() {
		//this model all position is false 
		boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumn()];
		return mat;

	}
}
