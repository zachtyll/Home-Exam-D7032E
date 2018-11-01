package refactor.programState;

public class JoinGameProgramState implements ProgramState {

    public void doAction(ProgramContext context) {
       System.out.println("Player is in Join Game state.");
       context.setState(this);
       // TODO: Add joining a hosted game functionality.
    }
 
    public String toString(){
       return "Join Game State";
    }
 }