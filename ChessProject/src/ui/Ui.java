package ui;

import chessmatch.ChessBoard;
import chessmatch.ChessPiece;

public class Ui {
	
	private ChessPiece[][] gamePos;
	private String[][] gamePos_String;
	
	public void showGame() {
			ChessBoard cb = new ChessBoard();
			gamePos = ChessBoard.getChessboard();
			gamePos_String = new String[gamePos.length][gamePos.length];
			
			System.out.println();
			
			for (int i = 0; i < gamePos.length; i++) {
				System.out.print(8 - i + " ");
				for (int j = 0; j < gamePos.length; j++) {
					if (gamePos[i][j] == null) {
						gamePos_String[i][j] = "-";
					} else {
						gamePos_String[i][j] = String.valueOf(gamePos[i][j]);
					}
					System.out.print(" " + gamePos_String[i][j] + " ");
				}
				System.out.println();
			}
			System.out.print("  ");
			for (int i = 0; i < gamePos.length; i++) {
				System.out.print(" " + (char)('A' + i) + " ");
			}
			System.out.println();
		}





}
