package chessmatch;

import java.util.Scanner;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chessmatch.Colors;
import chessmatch.Pieces.Rook;
public class ChessBoard {
	
	private static Board board;
	private static ChessPiece[][] chessboard;
	
	public void ChessBoard() {
		
		board = new Board(8,8);
		System.out.println(board.getColumns());
		System.out.println(board.getRows());
		
		chessboard = new ChessPiece[board.getColumns()][board.getRows()];
		Scanner sc = new Scanner(System.in);
		
		int game = 1;
		Position init = new Position(0,0);
		Rook bRook = new Rook(init, Color.BLACK);
		chessboard[0][0] = bRook;
		
		while (game == 1) {
			
			for (int i = 0; i < chessboard.length; i++) {
				System.out.println();
				for (int j = 0; j < chessboard.length; j++) {
					System.out.print(" " + chessboard[i][j] + " ");
				}}
			
			System.out.println("Que peça voce deseja mover? ROW");
			int gp_Row = sc.nextInt();
			System.out.println("Que peça voce deseja mover? COLUMN");
			int gp_Column = sc.nextInt();
			
			if (chessboard[gp_Row][gp_Column] == null) {
				System.out.println("Não há peça ali!");
			} else {
				
			}
			
			
			System.out.println("Insira a posicao que deseja mover o Rook ROW");
			int row = sc.nextInt();
			System.out.println("Insira a posicao que deseja mover o Rook COLUMN");
			int column = sc.nextInt();
			chessboard[row][column] = bRook;
			
			chessboard[gp_Row][gp_Column] = chessboard[row][column];
			chessboard[gp_Row][gp_Column] = null;
			game = 0;
		}
		
		
		Position pos = new Position(4,7);
		Position pos_end = new Position(1,1);
		Position pos_test = new Position(3,3);
		ChessPiece piece = new ChessPiece(pos, Colors.BLACK);
		Rook piece2 =new Rook(pos_end, Colors.BLACK);
		System.out.println(piece.isValidMove(chessboard, pos, pos_end));
		if (piece.isValidMove(chessboard, pos, pos_end) == true) {
		piece.setPosition(pos_test);}
		
		int row = piece.getPosition().getRow();
		int column = piece.getPosition().getColumn();
		chessboard[row][column] = piece;
		chessboard[piece2.getPosition().getRow()][piece2.getPosition().getColumn()] = piece2;
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
	
	
	


