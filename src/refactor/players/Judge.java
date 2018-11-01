package refactor.players;

public class Judge implements Role {
    private boolean isJudge = false;

    @Override
    public void setRole(boolean isJudge) {
        this.isJudge = isJudge;
    }

    @Override
    public boolean canAct() {
        return isJudge;
    }
 }