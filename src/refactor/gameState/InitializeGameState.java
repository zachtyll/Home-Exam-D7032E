package refactor.gameState;

import java.util.Collections;

import refactor.controllers.GameController;
import refactor.gameState.GameContext;
import refactor.models.PlayerModel;
import refactor.programIO.FileReader;

public class InitializeGameState implements GameState{

    public void doGameAction(GameContext context, GameController gameController) {
       System.out.println("Game is initializing.");
       context.setState(this);
       // TODO: Initialize everything...   
       
       // Read decks from file and add to game model, then shuffle them.
       FileReader fr = new FileReader();
       gameController.setRedApples(fr.readFile("redApples"));
       gameController.setGreenApples(fr.readFile("greenApples"));
       gameController.shuffleCards(gameController.getRedApples());
       gameController.shuffleCards(gameController.getGreenApples());
       
       // Decide how many cards needed to win depending on the amount of players.
	   switch(gameController.getNumberOfPlayers()) {
	   case 4 :
		   gameController.setCardsToWin(8);
		   break;
	   case 5 :
		   gameController.setCardsToWin(7);
		   break;
	   case 6 :					
		   gameController.setCardsToWin(6);
		   break;
	   case 7 :
		   gameController.setCardsToWin(5);
		   break;
	   case 8 :
		   gameController.setCardsToWin(4);
		   break;
	   default :
		   gameController.setCardsToWin(4);
		   break;
	   }
	   System.out.println(gameController.getPlayerList());
	   
	   // Deal players 7 cards each.
	   for(PlayerModel element : gameController.getPlayerList()) {
		   element.addRedApples(gameController.dealRedApples(7));
		   System.out.println("Player " + element.playerID()  + "has cards: " + element.getRedApples().size());
	   }
       
	   //Shuffle all players and set one as the judge.
       Collections.shuffle(gameController.getPlayerList());
       gameController.setPlayerRole(gameController.getPlayerList(), "Judge");
       
       System.out.println("Game has been initialized!");
    }
 
    public String toString(){
       return "Initialize Game State";
    }
}
