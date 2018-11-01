package refactor.gameState;

import refactor.gameState.GameContext;
import refactor.controllers.GameController;
import refactor.fileReader.FileReader;
import java.util.List;
import refactor.models.*;
import refactor.views.GameView;

public class InitializeGameState implements GameState{

    public void doGameAction(GameContext context) {
       System.out.println("Game is initializing.");
       context.setState(this);
       // TODO: Add joining a hosted game functionality.   
       GameModel gameModel = new GameModel();
       GameView gameView = new GameView();
       GameController gameController = new GameController(gameModel, gameView);
       // Build deck and add to game model
       FileReader fr = new FileReader();
       gameController.setRedApples(fr.readFile("redApples"));
       gameController.setGreenApples(fr.readFile("greenApples"));
       
       gameController.updateView();

       //update model data
       System.out.println(gameController.dealGreenApples());

       //gameController.updateView();

    }
 
    public String toString(){
       return "Initialize Game State";
    }
}
