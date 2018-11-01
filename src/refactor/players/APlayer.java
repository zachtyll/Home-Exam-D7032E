package refactor.players;

public class APlayer {
    private String playerID;
    private String playerType;
    // private List<Role> roleList;
    
    public String getPlayerID() {
       return playerID;
    }
    
    public void setPlayerID(String playerID) {
       this.playerID = playerID;
    }
    
    public String getPlayerType() {
       return playerType;
    }
    
    public void setPlayerType(String playerType) {
       this.playerType = playerType;
    }
 }