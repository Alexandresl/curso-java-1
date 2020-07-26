package s16.chess_system.chess;

import s16.chess_system.boardgame.Board;
import s16.chess_system.boardgame.Position;
import s16.chess_system.chess.pieces.Rook;
import s16.chess_system.chess.pieces.king;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new king(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new king(board, Color.WHITE), new Position(7, 4));
	}
	
}
