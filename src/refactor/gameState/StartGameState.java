package refactor.gameState;

import refactor.controllers.GameController;
import refactor.controllers.PlayerController;

public class StartGameState implements GameState {
	public void doGameAction(GameContext context, GameController gameController, PlayerController playerController) {
	       System.out.println("Game is started.");
	       context.setState(this);
	       // TODO: Add joining a hosted game functionality.   
	       
	    }
	 
	    public String toString(){
	       return "Start Game State";
	    }
}
