package refactor.programState;

import java.util.Scanner;

import refactor.programIO.ProgramScanner;

public class OnlineGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Online Game state.");
       context.setState(this);
       System.out.println("Enter characters, 'q' to quit.");
           	
       
       ProgramScanner sc = ProgramScanner.getInstance();
       
       switch(sc.readChar()) {
       case '1' :
    	   System.out.println("Entering Host Game State.\n");
    	   OnlineGameProgramState onlineGameState = new OnlineGameProgramState();
    	   onlineGameState.doAction(context);
    	   break;
       case '2' :
    	   System.out.println("Entering Join Hosted Game State.\n");
    	   JoinGameProgramState joinGameState = new JoinGameProgramState();
    	   joinGameState.doAction(context);
    	   break;
       case 'q' :					
    	   System.out.println("Entering stop state and closing down program...\n");
    	   StopProgramState stopGameState = new StopProgramState();
    	   stopGameState.doAction(context);
    	   break;
       default :
    	   System.out.println("Invalid choise\n");
    	   doAction(context);
       }
    }
 
    public String toString(){
       return "Online Game State";
    }
 }