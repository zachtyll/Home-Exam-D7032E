package refactor.programState;

import java.util.Scanner;

public class StartProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
    	context.setState(this);
   		Scanner sc = new Scanner(System.in); 
   		
   		System.out.println("Enter characters, 'q' to quit.");
   		System.out.println("[1] Join online game.");
        System.out.println("[2] Host online game.");
        System.out.println("[3] Create local game.");
        System.out.println("[4] Configure Settings.");
   		
   		try {
    		char c = sc.next().charAt(0);
    		switch(c) {
    			case '1' :
    				System.out.println("Entering Join Hosted Game State.\n");
   					JoinGameProgramState joinGameState = new JoinGameProgramState();
   					joinGameState.doAction(context);
   					break;
   				case '2' :
   					System.out.println("Entering Host Game State.\n");
   					OnlineGameProgramState onlineGameState = new OnlineGameProgramState();
   					onlineGameState.doAction(context);
   					break;
   				case '3' :
   					System.out.println("Entering Join Hosted Game State.\n");
   					LocalGameProgramState localGameState = new LocalGameProgramState();
   					localGameState.doAction(context);
   					break;
   				case '4' :
   					System.out.println("Entering Configure Settings State.\n");
   					ConfigureGameProgramState configureGameState = new ConfigureGameProgramState();
   					configureGameState.doAction(context);
   				case 'q' :					
   					System.out.println("Entering stop state and closing down program...\n");
   					StopProgramState stopGameState = new StopProgramState();
   					stopGameState.doAction(context);
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
       return "Start State";
    }
 }