package refactor.programState;

public class ConfigureGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Configure Game state.");
       context.setState(this);
       // TODO: Add creating a configure game functionality.
    }
 
    public String toString(){
       return "Configure Game State";
    }
 }