package refactor.programState;

import java.util.Scanner;

public class OnlineGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Online Game state.");
       context.setState(this);
       System.out.println("Enter characters, 'q' to quit.");
       
       Scanner sc = new Scanner(System.in);    				  
       try {
    	   char c = sc.next().charAt(0);
    	   switch(c) {
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
    		   System.out.println("Invalid grade\n");
    		   doAction(context);
    	   }
    	   } finally {
    		   if (sc != null) {
    			   sc.close();
    		   }
    	   }
    }
 
    public String toString(){
       return "Online Game State";
    }
 }