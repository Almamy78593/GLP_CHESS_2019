package pieces;

import board.Coordonates;

public class Advisor extends Piece {

	private static final int PIECE_ID = 3;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(1, 1), new Coordonates(1, 1) };

	public Advisor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Advisor(int x, int y, Boolean color) {
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
