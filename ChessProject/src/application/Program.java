package application;

import java.util.Scanner;

import boardgame.Position;
import chessmatch.ChessBoard;
import logic.GameLogic;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessBoard cb = new ChessBoard();
		cb.ChessBoard();
		Ui ui = new Ui();
		ui.showGame();
		GameLogic gl = new GameLogic();
		gl.Logic();
		Position pos;


		
		
	}
}
