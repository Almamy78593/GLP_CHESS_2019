package stats;

import board.Board;

public class Match {

	private Player player1 = new Player("Player 1", true);
	private Player player2 = new Player("Player 2", false);
	private Player curentplayer = player1;
	private Board board = new Board();

	public Match() {
		// TODO Auto-generated constructor stub
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getCurentplayer() {
		return curentplayer;
	}

	public void setCurentplayer(Player curentplayer) {
		this.curentplayer = curentplayer;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void changingTurn() {
		if(getCurentplayer().equals(player1)) {
			setCurentplayer(player2);
		}
		else {
			setCurentplayer(player1);
		}
	}
}
