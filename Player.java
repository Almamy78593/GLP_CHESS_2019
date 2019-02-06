package stats;

public class Player {

	private String name = "Player";
	private Boolean color = true;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String name, Boolean color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getColor() {
		return color;
	}
}
