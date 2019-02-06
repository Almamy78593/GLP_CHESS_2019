package pieces;

import board.Coordonates;

public class Piece {

	private Coordonates coordonates = new Coordonates();
	private static final int PIECE_ID = 0;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(), new Coordonates() };

	// true = red, plays first
	// false = black, plays second
	private Boolean color;

	public Piece() {

	}

	public Piece(int x, int y, Boolean color) {
		super();
		this.coordonates.setX(x);
		this.coordonates.setY(y);
		this.color = color;
	}

	public Piece(Coordonates coordonates, Boolean color) {
		super();
		this.coordonates = coordonates;
		this.color = color;
	}

	public Coordonates getCoordonates() {
		return coordonates;
	}

	public void setCoordonates(Coordonates coordonates) {
		this.coordonates = coordonates;
	}

	public void setCoordonates(int x, int y) {
		coordonates.setX(x);
		coordonates.setY(y);
	}

	public static int getPieceId() {
		return PIECE_ID;
	}

	public static Coordonates[] getPiecePatern() {
		return PIECE_PATERN;
	}

	public Boolean getColor() {
		return color;
	}

	public void setColor(Boolean color) {
		this.color = color;
	}

}
