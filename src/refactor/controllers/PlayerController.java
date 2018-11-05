package refactor.controllers;

import java.util.List;
import java.util.Set;

import refactor.models.PlayerModel;
import refactor.views.PlayerView;

public class PlayerController {
	   private PlayerModel model;
	   private PlayerView view;

	   public PlayerController(PlayerModel model, PlayerView playerView){
	      this.model = model;
	      this.view = playerView;
	   }
	   
	   public Set<String> getPlayerRoles() {
		   return model.getRoles();
	   }
	   
	   public void addPlayerRole(String role) {
		   model.addRole(role);
	   }

	   public void addGreenApples(List<String> greenApples){
	      model.addGreenApples(greenApples);		
	   }

	   public List<String> getGreenApples(){
	      return model.getGreenApples();		
	   }

	   public void addRedApples(List<String> redApples){
	      model.addRedApples(redApples);		
	   }

	   public List<String> getRedApples(){
	      return model.getRedApples();		
	   }
	   
	   public String playRedApples(int chosenCard) {
		   String playedCard = model.getRedApples().get(chosenCard);
		   model.getRedApples().remove(chosenCard);
		   return playedCard;
	   }
		
	   public String playGreenApples() {
		   String dealtCard = model.getGreenApples().get(0);
		   model.getGreenApples().remove(0);
		   return dealtCard;
	   }

	   public void updateView(){				
	      view.printPlayerDetails(model.getGreenApples(), model.getRedApples());
	   }	
	}
