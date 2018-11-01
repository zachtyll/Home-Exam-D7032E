package refactor.players;

public class JudgePlayerDecorator extends PlayerDecorator {
    private boolean isJudge = false;

    public JudgePlayerDecorator(Player decoratedPlayer) {
      super(decoratedPlayer);		
    }

    @Override
    public void setPlayerID(String playerID) {
        decoratedPlayer.setPlayerID(playerID);
        System.out.println("ID SET!");
    }
    
    @Override
    public void setPlayerType(String playerType) {
        decoratedPlayer.setPlayerType(playerType);
        System.out.println("TYPE SET!");
    }

    @Override
    public String getPlayerID() {
        setJudge(true);
        return decoratedPlayer.getPlayerID();
    }

    @Override
    public String getTypeOfPlayer() {
        System.out.println("PINGAS!");   
        voteOnWinner();    
        return decoratedPlayer.getTypeOfPlayer();
    }

    private void setJudge (boolean isJudge) {
        System.out.println("Setting judge to:" + isJudge); 
        this.isJudge = isJudge;
    }

    private void voteOnWinner() {
        if (isJudge) {
            System.out.println("Player " + decoratedPlayer.getPlayerID() + " gets to vote on a winner!");
            setJudge(true);
        } else {
            System.out.println("Player" + decoratedPlayer.getPlayerID() + "is not allowed to vote!");
        }
    }
}