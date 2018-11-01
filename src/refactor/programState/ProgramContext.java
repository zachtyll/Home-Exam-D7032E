package refactor.programState;

public class ProgramContext {
    private ProgramState state;
 
    public ProgramContext(){
       state = null;
    }
 
    public void setState(ProgramState state){
       this.state = state;		
    }
 
    public ProgramState getState(){
       return state;
    }
 }