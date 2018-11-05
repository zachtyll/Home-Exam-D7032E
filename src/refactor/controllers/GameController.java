package refactor.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import refactor.models.GameModel;
import refactor.models.PlayerModel;
import refactor.views.GameView;

public class GameController {
	   private GameModel model;
	   private GameView view;

	   public GameController(GameModel model, GameView view){
	      this.model = model;
	      this.view = view;
	   }
	   
	   public int getCardsToWin() {
		   return model.getCardsToWin();
	   }
	   
	   public void setCardsToWin(int cardsToWin) {
		   model.setCardsToWin(cardsToWin);
	   }
	   
	   public List<PlayerModel> getPlayerList() {
			return model.getPlayerList();
		}
		
		public void addPlayerList(PlayerModel playerList) {
			model.addPlayerList(playerList);	
		}
	   
	   public int getNumberOfPlayers() {
		   return model.getNumberOfPlayers();
	   }
	   
	   public void setNumberOfPlayers(int numberOfPlayers) {
		   model.setNumberOfPlayers(numberOfPlayers);
	   }

	   public void setGreenApples(List<String> greenApples){
	      model.setGreenApples(greenApples);		
	   }

	   public List<String> getGreenApples(){
	      return model.getGreenApples();		
	   }

	   public void setRedApples(List<String> redApples){
	      model.setRedApples(redApples);		
	   }

	   public List<String> getRedApples(){
	      return model.getRedApples();		
	   }
	   
	   public List<String> dealRedApples(int numberOfCards) {
		   List<String> dealtCard = new ArrayList<String>();
		   for (int i=0; i < numberOfCards; i++) {
			   dealtCard.add(model.getRedApples().get(0));
			   model.getRedApples().remove(0);
		   }
		   return dealtCard;
	   }
		
		public List<String> dealGreenApples(int numberOfCards) {
			List<String> dealtCard = new ArrayList<String>();
			for (int i=0; i < numberOfCards; i++) {
				dealtCard.add(model.getGreenApples().get(0));
				model.getGreenApples().remove(0);
			}
			return dealtCard;
		}
		
		public void shuffleCards(List<String> deck) {
			Collections.shuffle(deck);
		}
		
		public void setPlayerRole(List<PlayerModel> playerList, String role) {
			if (getPlayerList().get(0).getRoles().contains(role)) {
				getPlayerList().get(0).getRoles().remove(role);
				Collections.rotate(playerList, 1);
			}
			getPlayerList().get(0).addRole(role);
		}
		
		public PlayerModel getPlayerRole(int playerID) {
			return model.getPlayerList().get(playerID);
		}

	   public void updateView(){				
	      view.printGameDetails(model.getGreenApples(), model.getRedApples(), model.getPlayerList());
	   }	
	}