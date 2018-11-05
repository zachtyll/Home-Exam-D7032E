package refactor.models;

import java.util.*;

public class PlayerModel {
	private String playerName;
	private int playerID;
	private Set<String>  roleList = new HashSet<String>();
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
	
	public Set<String> getRoles() {
		return roleList;
	}
		   
	public void addRole(String role) {
		this.roleList.add(role);
	}
	
	public List<String> getRedApples() {
		return redApples;
	}
		   
	public void addRedApples(List<String> redApples) {
		this.redApples.addAll(redApples);
	}
		   
	public List<String> getGreenApples() {
		return greenApples;
	}
		   
	public void addGreenApples(List<String> greenApples) {
		this.greenApples.addAll(greenApples);
	}
	
	// TODO: Add function "playCard" which returns a card for the game model to use.
	
	public List<String> getDiscardedRedApples() {
		return discardedRedApples;
	}
	
	public void addDiscardedRedApples(String discardedRedApples) {
		this.discardedRedApples.add(discardedRedApples);
	}
}
