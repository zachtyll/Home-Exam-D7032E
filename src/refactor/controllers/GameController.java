package refactor.controllers;

import java.util.Collections;
import java.util.List;

import refactor.models.GameModel;
import refactor.views.GameView;

public class GameController {
	   private GameModel model;
	   private GameView view;

	   public GameController(GameModel model, GameView view){
	      this.model = model;
	      this.view = view;
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
	   
	   public String dealRedApples() {
		    String dealtCard = model.getRedApples().get(0);
			model.getRedApples().remove(0);
			return dealtCard;
		}
		
		public String dealGreenApples() {
			String dealtCard = model.getGreenApples().get(0);
			model.getGreenApples().remove(0);
			return dealtCard;
		}
		
		public void shuffleCards(List<String> deck) {
			Collections.shuffle(deck);
		}

	   public void updateView(){				
	      view.printDeckDetails(model.getGreenApples(), model.getRedApples());
	   }	
	}