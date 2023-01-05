package application;

import chessmatch.ChessBoard;
import logic.GameLogic;
import ui.Ui;

public class Program {
	public static void main(String[] args) {

		ChessBoard cb = new ChessBoard();
		cb.ChessBoard();
		Ui ui = new Ui();
		ui.showGame();
		GameLogic gl = new GameLogic();
		gl.Logic();
		
		
	}
}
