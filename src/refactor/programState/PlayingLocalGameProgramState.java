package refactor.programState;

import java.util.Scanner;

import refactor.config.ConfigSingleton;
import refactor.controllers.GameController;
import refactor.gameState.GameContext;
import refactor.gameState.InitializeGameState;
import refactor.gameState.StartGameState;
import refactor.models.GameModel;
import refactor.models.PlayerModel;
import refactor.programIO.ProgramScanner;
import refactor.views.GameView;
import refactor.views.PlayerView;

public class PlayingLocalGameProgramState implements ProgramState {
	public void doAction(ProgramContext context) {
		System.out.println("Please Select number of players!");
		context.setState(this);
		
		// TODO: Add creating a local game functionality.
		GameModel gameModel = new GameModel();
		GameView gameView = new GameView();
		GameController gameController = new GameController(gameModel, gameView);
		
		ProgramScanner sc = ProgramScanner.getInstance();

		// Set the number of players for the match.
		do {
			gameController.setNumberOfPlayers((sc.readInt()));
			if (gameController.getNumberOfPlayers() < 4) {
				System.out.println("Please enter a number above 4!");
			} else {
				break;
			}
		} while (true);
		
		// Add the player models to the game model according to number of players and
		// set the player ID for each player.
		for(int i = 0; i < gameController.getNumberOfPlayers(); i++) {
			gameController.addPlayerList(new PlayerModel());
			gameController.getPlayerList().get(i).setPlayerID(i);
		}
		
		
		// Transition into initialization.
		GameContext gameContext = new GameContext();
        InitializeGameState initializeGameState = new InitializeGameState();
        initializeGameState.doGameAction(gameContext, gameController);
        
        
        
        // Transition into game loop.
        StartGameState startGameState = new StartGameState();
        startGameState.doGameAction(gameContext, gameController);
	}

	public String toString(){
		return "Playing Local Game State";
	}
}
