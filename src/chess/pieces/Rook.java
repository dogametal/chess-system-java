package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString () {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		//this model all position is false 
		boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumn()];
		
		Position p = new Position(0, 0);
		//above piece
		p.setValues(position.getRow()-1, position.getColumn());	
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()-1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true; 
		}

		//Left piece
		p.setValues(position.getRow(), position.getColumn()-1);	
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()-1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true; 
		}
		
		//Right piece
		p.setValues(position.getRow(), position.getColumn()+1);	
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()+1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true; 
		}

		//below piece
		p.setValues(position.getRow()+1, position.getColumn());	
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()+1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat [p.getRow()][p.getColumn()] = true; 
		}
		
		
		return mat;
	}
}
