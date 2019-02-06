package pieces;

import board.Coordonates;

public class Soldier extends Piece {

	private static final int PIECE_ID = 1;
	private static final Coordonates PIECE_PATERN[] = { new Coordonates(0, 1), new Coordonates(1, 0) };

	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Soldier(int x, int y, Boolean color) {
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
