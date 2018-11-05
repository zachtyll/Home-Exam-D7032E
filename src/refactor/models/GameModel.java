package refactor.models;

import java.util.*;

import refactor.models.PlayerModel;

public class GameModel {
	private List<String> redApples;
	private List<String> greenApples;
	private List<String> discardedRedApples;
	private List<String> discardedGreenApples;
	private List<PlayerModel> playerList = new ArrayList<PlayerModel>();
	private int numberOfPlayers;
	private int cardsToWin;
		  
	public int getCardsToWin() {
		return cardsToWin;
	}
	
	public void setCardsToWin(int cardsToWin) {
		this.cardsToWin = cardsToWin;
	}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public List<PlayerModel> getPlayerList() {
		return playerList;
	}
	
	public void addPlayerList(PlayerModel playerList) {
		this.playerList.add(playerList);
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
