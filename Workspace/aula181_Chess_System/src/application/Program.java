package application;

import chess.ChessMatch;

public final class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPiece());

	}

}
