package refactor.programState;

import refactor.controllers.GameController;
import refactor.controllers.PlayerController;
import refactor.gameState.GameContext;
import refactor.gameState.InitializeGameState;
import refactor.models.GameModel;
import refactor.models.PlayerModel;
import refactor.views.GameView;
import refactor.views.PlayerView;

public class PlayingLocalGameProgramState implements ProgramState {
	public void doAction(ProgramContext context) {
		System.out.println("Local Game Started. Enjoy the game!");
		context.setState(this);
		// TODO: Add creating a local game functionality.
		
		GameModel gameModel = new GameModel();
		GameView gameView = new GameView();
		GameController gameController = new GameController(gameModel, gameView);
		       
		PlayerModel playerModel = new PlayerModel();
		PlayerView playerView = new PlayerView();
		PlayerController playerController = new PlayerController(playerModel, playerView);
		
		
		GameContext gameContext = new GameContext();
        InitializeGameState initializeGameState = new InitializeGameState();
        initializeGameState.doGameAction(gameContext, gameController, playerController);
	
	}
	 
	public String toString(){
		return "Playing Local Game State";
	}
}
