package refactor.players;

public class PlayerController {
    private APlayer model;
    private PlayerView view;
 
    public PlayerController(APlayer model, PlayerView view){
       this.model = model;
       this.view = view;
    }
 
    public void setPlayerID(String playerID){
       model.setPlayerID(playerID);		
    }
 
    public String getPlayerID(){
       return model.getPlayerID();		
    }
 
    public void setPlayerType(String playerType){
       model.setPlayerType(playerType);		
    }
 
    public String getPlayerType(){
       return model.getPlayerType();		
    }
 
    public void updateView(){				
       view.printPlayerDetails(model.getPlayerID(), model.getPlayerType());
    }	
 }