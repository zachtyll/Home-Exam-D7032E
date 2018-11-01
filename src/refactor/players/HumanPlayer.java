package refactor.players;

public class HumanPlayer implements Player {
    private String playerID;
    private String playerType;

    @Override
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
    
    @Override
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    @Override
    public String getPlayerID() {
        return playerID;
    }

    @Override
    public String getTypeOfPlayer() {
        return  playerType;
    }
    
 }