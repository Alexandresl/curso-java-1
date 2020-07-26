package s16.chess_system.chess.pieces;

import s16.chess_system.boardgame.Board;
import s16.chess_system.chess.ChessPiece;
import s16.chess_system.chess.Color;

public class king extends ChessPiece {

	public king(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
