package refactor.programState;

import java.util.Scanner;

import refactor.programIO.ProgramScanner;
import refactor.programState.PlayingLocalGameProgramState;;


public class LocalGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Local Game state.");
       context.setState(this);
       // TODO: Add creating a local game functionality.
 		
       System.out.println("Enter characters, 'q' to go to main menu.");
       System.out.println("[1] Start game.");
       System.out.println("[2] Configure game settings.");
      	
       ProgramScanner sc = ProgramScanner.getInstance();
       switch(sc.readChar()) {
       		case '1' :
    	   		System.out.println("Starting a new Local Game.");
    	   		PlayingLocalGameProgramState playingLocalGameState = new PlayingLocalGameProgramState();
    	   		playingLocalGameState.doAction(context);
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
    }
 
    public String toString(){
       return "Local Game State";
    }
 }