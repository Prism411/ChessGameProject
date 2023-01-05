package chessmatch;

import boardgame.Board;

public class ChessBoard {
	
	private static Board board;
	private int[][] chessboard;
	
	public void ChessBoard() {
		
		board = new Board(8,8);
		System.out.println(board.getColumns());
		System.out.println(board.getRows());
		
		chessboard = new int[board.getColumns()][board.getRows()];

		for (int i = 0; i < 8; i++) {
			System.out.println();
			for (int j = 0; j < 8; j++) {
				System.out.print(" " + chessboard[i][j] + " ");

			}
		}
		

		
		
		
		}

	public int[][] getChessboard() {
		return chessboard;
	}

		
	}
	
	
	


