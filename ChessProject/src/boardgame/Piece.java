package boardgame;

import boardgame.Board;
import boardgame.Position;

	public class Piece {
	
	private Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
