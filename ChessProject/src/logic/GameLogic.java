package logic;

import chessmatch.ChessBoard;
import chessmatch.ChessPiece;

public class GameLogic {
	
	private ChessPiece[][] gamePos;
	
	public void Logic() {
		
		gamePos = ChessBoard.getChessboard();
		
		
		for (int i = 0; i < gamePos.length; i++) {
			System.out.println();
			for (int j = 0; j < gamePos.length; j++) {
				System.out.print(" " + gamePos[i][j] + " ");

			
			
			
			
			}
		}
		
		
		
	}
	
	public ChessPiece[][] getGamePos() {
		return gamePos;
	}

	public void setGamePos(ChessPiece[][] gamePos) {
		this.gamePos = gamePos;
	}
	

}
