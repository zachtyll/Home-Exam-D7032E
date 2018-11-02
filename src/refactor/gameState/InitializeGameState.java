package refactor.gameState;

import refactor.controllers.GameController;
import refactor.controllers.PlayerController;
import refactor.fileReader.FileReader;
import refactor.gameState.GameContext;

public class InitializeGameState implements GameState{

    public void doGameAction(GameContext context, GameController gameController, PlayerController playerController) {
       System.out.println("Game is initializing.");
       context.setState(this);
       // TODO: Initialize everything...   
       
       // Read decks from file and add to game model, then shuffle them.
       FileReader fr = new FileReader();
       gameController.setRedApples(fr.readFile("redApples"));
       gameController.setGreenApples(fr.readFile("greenApples"));
       gameController.shuffleCards(gameController.getRedApples());
       gameController.shuffleCards(gameController.getGreenApples());
       
       int numberOfCards;
	   switch(gameController.getNumberOfPlayers()) {
	   case '4' :
		   numberOfCards = 8;
		   break;
	   case '5' :
		   numberOfCards = 7;
		   break;
	   case '6' :					
		   numberOfCards = 6;
		   break;
	   case '7' :
		   numberOfCards = 5;
		   break;
	   case '8' :
		   numberOfCards = 4;
		   break;
	   default :
		   numberOfCards = 4;
		   break;
	   }
       for(int i = 0; i < numberOfCards; i++) {
    	   playerController.addRedApples(gameController.dealRedApples());
       }
       
       gameController.updateView();
       playerController.updateView();
       
       
    }
 
    public String toString(){
       return "Initialize Game State";
    }
}
