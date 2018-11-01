package refactor.players;

public abstract class PlayerDecorator implements Player {
    protected Player decoratedPlayer;
 
    public PlayerDecorator(Player decoratedPlayer){
       this.decoratedPlayer = decoratedPlayer;
    }

    public void setPlayerID(String playerID) {
        decoratedPlayer.setPlayerID(playerID);
    }
    
    public void setPlayerType(String playerType) {
        decoratedPlayer.setPlayerType(playerType);
    }

    public String getPlayerID() {
        return decoratedPlayer.getPlayerID();
    }

    public String getTypeOfPlayer() {
        return decoratedPlayer.getTypeOfPlayer();
    }	
 }