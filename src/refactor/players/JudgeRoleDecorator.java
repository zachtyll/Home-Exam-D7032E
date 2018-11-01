package refactor.players;

public class JudgeRoleDecorator extends RoleDecorator {

    public JudgeRoleDecorator(Role decoratedRole) {
        super(decoratedRole);		
    }

    @Override
    public void setRole(boolean isRole) {
        System.out.println("Role Judge has been set to: " + isRole);
        decoratedRole.setRole(isRole);
    }

    @Override
    public boolean canAct() {
        if (decoratedRole.canAct()) {
            System.out.println("We can act!");
            vote(decoratedRole);
        } else {
            System.out.println("We cannot act!");
        }
        return decoratedRole.canAct();
    }

    private void vote(Role decoratedRole) {
        System.out.println("Voted Success!");
    }
}