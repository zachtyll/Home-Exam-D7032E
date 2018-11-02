package refactor;

import refactor.programState.*;
import refactor.config.ConfigSingleton;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	//illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        ConfigSingleton config = ConfigSingleton.getInstance();

        //show the message
        config.showMessage();
        
        
    	
        ProgramContext context = new ProgramContext();
        StartProgramState startGameState = new StartProgramState();
        startGameState.doAction(context);  
    }
}
 