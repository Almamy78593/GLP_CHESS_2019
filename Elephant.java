package pieces;

import board.Coordonates;

public class Elephant extends Piece {

	private static final int PIECE_ID = 2;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(2, 2), new Coordonates(2, 2) };

	public Elephant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Elephant(int x, int y, Boolean color) {
		super(x,y,color);
		// TODO Auto-generated constructor stub
	}

	public static int getPieceId() {
		return PIECE_ID;
	}

	public static Coordonates[] getPiecePatern() {
		return PIECE_PATERN;
	}

}
