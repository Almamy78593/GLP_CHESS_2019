package pieces;

import board.Coordonates;

public class General extends Piece {

	private static final int PIECE_ID = 7;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(1, 0), new Coordonates(0, 1) };

	public General() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public General(int x, int y, Boolean color) {
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
