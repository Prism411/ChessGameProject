package boardgame;

public class Board {
	private Piece piece;
	private int columns;
	private int rows;
	private Piece[][] pieces;

	public Board(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[columns][rows];
	}
	
	public void setBoard(Piece[][] board) {
		this.pieces = board;
	}

	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	
	
	
} 


