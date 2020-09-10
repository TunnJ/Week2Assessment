package main;

public class Game {
	private int iowaScore;
	private int isuScore;
	private boolean lighting;

	public boolean willHaveGame(Game game) {
		if (game.isLighting() == true) {
			return false;
		} else {
			return true;
		}
	}

	public boolean overtime(Game game) {
		if (game.getIowaScore() == game.getIsuScore()) {
			return true;
		} else {
			return false;
		}
	}

	public String winner(Game game) {
		if (game.getIowaScore() > game.getIsuScore()) {
			return "Iowa";
		} else {
			return "Iowa State";
		}
	}

	public int getIowaScore() {
		return iowaScore;
	}

	public void setIowaScore(int iowaScore) {
		this.iowaScore = iowaScore;
	}

	public int getIsuScore() {
		return isuScore;
	}

	public void setIsuScore(int isuScore) {
		this.isuScore = isuScore;
	}

	public boolean isLighting() {
		return lighting;
	}

	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}

	public Game() {

	}
}
