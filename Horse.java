package pieces;

import board.Coordonates;

public class Horse extends Piece {

	private static final int PIECE_ID = 4;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(1, 2), new Coordonates(2, 1) };

	public Horse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Horse(int x, int y, Boolean color) {
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
