package refactor.gameState;

import refactor.gameState.GameState;

public class GameContext {
    private GameState state;
 
    public GameContext(){
       state = null;
    }
 
    public void setState(GameState state){
       this.state = state;		
    }
 
    public GameState getState(){
       return state;
    }
 }
