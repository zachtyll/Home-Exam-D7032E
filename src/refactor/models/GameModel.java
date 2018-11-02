package refactor.models;

import java.util.*;

public class GameModel {
	private List<String> redApples;
	private List<String> greenApples;
	private List<String> discardedRedApples;
	private List<String> discardedGreenApples;
	private int numberOfPlayers;
	private List<PlayerModel> playerList;
		  
	public List<PlayerModel> getPlayerList() {
		return playerList;
	}
	
	public void setPlayerList(List<PlayerModel> playerList) {
		this.playerList = playerList;
	}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public List<String> getRedApples() {
		return redApples;
	}
		   
	public void setRedApples(List<String> redApples) {
		this.redApples = redApples;
	}
		   
	public List<String> getGreenApples() {
		return greenApples;
	}
		   
	public void setGreenApples(List<String> greenApples) {
		this.greenApples = greenApples;
	}
	
	public List<String> getDiscardedRedApples() {
		return discardedRedApples;
	}
	
	public List<String> getDiscardedGreenApples() {
		return discardedGreenApples;
	}
}
