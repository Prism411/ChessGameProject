package chessmatch;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chessmatch.Colors;
public class ChessBoard {
	
	private static Board board;
	private static ChessPiece[][] chessboard;
	
	public void ChessBoard() {
		
		board = new Board(8,8);
		System.out.println(board.getColumns());
		System.out.println(board.getRows());
		
		chessboard = new ChessPiece[board.getColumns()][board.getRows()];
		
		Position pos = new Position(4,7);
		ChessPiece piece = new ChessPiece(pos, Colors.BLACK);

		int row = piece.getPosition().getRow();
		int column = piece.getPosition().getColumn();
		chessboard[row][column] = piece;
	
		//int row = piece.getPosition().getRow(); //Fileira
		//int column = piece.getPosition().getColumn(); //Coluna
		
		for (int i = 0; i < chessboard.length; i++) {
			System.out.println();
			for (int j = 0; j < chessboard.length; j++) {
				System.out.print(" " + chessboard[i][j] + " ");

			}
		}
		
		
		
		
		
		}

	public static ChessPiece[][] getChessboard() {
		return chessboard;
	}

		
	}
	
	
	


