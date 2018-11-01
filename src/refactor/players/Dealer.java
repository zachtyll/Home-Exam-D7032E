package refactor.players;

public class Dealer implements Role {
    private boolean isDealer = false;

    @Override
    public void setRole(boolean isDealer) {
        this.isDealer = isDealer;
    }

    @Override
    public boolean canAct() {
        return isDealer;
    }
 }