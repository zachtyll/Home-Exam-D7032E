package refactor.gameState;

import refactor.gameState.GameContext;

import refactor.fileReader.FileReader;
import java.util.List;


public class InitializeGameState implements GameState{

    public void doGameAction(GameContext context) {
       System.out.println("Game is initializing.");
       context.setState(this);
       // TODO: Add joining a hosted game functionality.   
       
       // Build deck and add to board model
       FileReader fr = new FileReader();
       List<String> redApples = fr.readFile("redApples");
       List<String> greenApples = fr.readFile("greenApples");
    }
 
    public String toString(){
       return "Initialize Game State";
    }
}
