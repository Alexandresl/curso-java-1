package s16.chess_system.chess;

import s16.chess_system.boardgame.Board;
import s16.chess_system.boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
