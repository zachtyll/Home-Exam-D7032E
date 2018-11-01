package refactor.programState;

public class StopProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Stop Game state. Closing down program!");
       context.setState(this);
       System.exit(0);
    }
 
    public String toString(){
       return "Stop Game State";
    }
 }