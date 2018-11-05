package refactor.gameState;

import java.util.Scanner;

import refactor.controllers.GameController;
import refactor.programIO.ProgramScanner;

public class StartGameState implements GameState {
	public void doGameAction(GameContext context, GameController gameController) {
        System.out.println("Local Game Started. Enjoy the game!");
		context.setState(this);
		// TODO: Add game functionality.   
		System.out.println("The green card for this round is: " + gameController.dealGreenApples(1));
		System.out.println("Please pick a red card to play!");
		System.out.println(gameController.getPlayerList().get(0).getRedApples());
		
		ProgramScanner sc = ProgramScanner.getInstance();
			
		do {
			int pickedCard = sc.readInt();
			if (pickedCard < gameController.getPlayerList().get(0).getRedApples().size()) {
				String playedCard = gameController.getPlayerList().get(0).getRedApples().get(pickedCard);
				System.out.println("The played card for player" + gameController.getPlayerList().get(0).playerID() + " is " + playedCard);
				break;
			} else {
				System.out.println("Please enter a valid number!");
			}
		} while(true);
	}
	 
	public String toString(){
		return "Start Game State";
	}
}
