package refactor.models;

import java.util.*;

public class PlayerModel {
	private String playerName;
	private int playerID;
	private List<String> redApples = new ArrayList<String>();
	private List<String> greenApples = new ArrayList<String>();
	private List<String> discardedRedApples = new ArrayList<String>();
	
	public String getPlayerName() {
		return playerName;
	}
	
	public int playerID() {
		return playerID;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
		   
	public List<String> getRedApples() {
		return redApples;
	}
		   
	public void addRedApples(String redApples) {
		this.redApples.add(redApples);
	}
		   
	public List<String> getGreenApples() {
		return greenApples;
	}
		   
	public void addGreenApples(String greenApples) {
		this.greenApples.add(greenApples);
	}
	
	public List<String> getDiscardedRedApples() {
		return discardedRedApples;
	}
	
	public void addDiscardedRedApples(String discardedRedApples) {
		this.discardedRedApples.add(discardedRedApples);
	}
}
