package refactor.gameState;

import refactor.controllers.GameController;
import refactor.controllers.PlayerController;
import refactor.gameState.GameContext;

public interface GameState {
	public void doGameAction(GameContext context, GameController gameController, PlayerController playerController);
}
