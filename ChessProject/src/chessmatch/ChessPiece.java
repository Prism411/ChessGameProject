package chessmatch;

import boardgame.Piece;
import boardgame.Position;
import chessmatch.Colors;

public class ChessPiece extends Piece {
	
	Colors color;

	
	public ChessPiece(Position position, Colors color) {
		super(position);
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	public String toString() {
		return "B";
	}
	
	

	
	

}
