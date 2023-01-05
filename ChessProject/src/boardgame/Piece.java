package boardgame;


public class Piece  {
	
	Position position;

	public Piece(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}
