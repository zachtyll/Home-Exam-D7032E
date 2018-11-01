package refactor.programState;

import java.util.Scanner;

import refactor.gameState.GameContext;
import refactor.gameState.InitializeGameState;

public class LocalGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Local Game state.");
       context.setState(this);
       // TODO: Add creating a local game functionality.
       
       Scanner sc = new Scanner(System.in); 
 		
       System.out.println("Enter characters, 'q' to go to main menu.");
       System.out.println("[1] Start game.");
       System.out.println("[2] Configure game settings.");
       try {		
    	   char c = sc.next().charAt(0);
    	   switch(c) {
    	   	case '1' :
    	        GameContext gameContext = new GameContext();
    	        InitializeGameState initializeGameState = new InitializeGameState();
    	        initializeGameState.doGameAction(gameContext);
  				break;
    	   	case '2' :
    	   		System.out.println("TODO: Build config functionality!!!");
  			case 'q' :					
  				System.out.println("Going back to main menu.\n");
  				StartProgramState startGameState = new StartProgramState();
  				startGameState.doAction(context);
  				break;
  			default :
  				System.out.println("Invalid input!\n");
  				doAction(context);
    	   }
       } finally {
    	   if (sc != null) {
    		   sc.close();
    	   }
       }
    }
 
    public String toString(){
       return "Local Game State";
    }
 }