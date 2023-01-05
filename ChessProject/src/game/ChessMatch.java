package game;
import boardgame.Position;
import boardgame.Piece;
import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	} 
	
	public void BoardMatch() {
		Position pos = new Position(2, 3); // linha 2, coluna 3
		Piece piece = new Piece(board);
		board.setPiece(piece);
		int i;
		int j;
		for (i = 0; i < board.getColumns(); i++) {
			for (j = 0; j < board.getRows(); j++) {
													{
				}
			}

		}

		}

	}
	

