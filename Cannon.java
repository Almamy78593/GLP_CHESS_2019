package pieces;

import board.Coordonates;

public class Cannon extends Piece {

	private static final int PIECE_ID = 5;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(-1, 0), new Coordonates(0, -1) };

	public Cannon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cannon(int x, int y, Boolean color) {
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
