package refactor.players;

public class DealerRoleDecorator extends RoleDecorator {

    public DealerRoleDecorator(Role decoratedRole) {
        super(decoratedRole);		
    }

    @Override
    public void setRole(boolean isRole) {
        System.out.println("Role Dealer has been set to: " + isRole);
        decoratedRole.setRole(isRole);
    }

    @Override
    public boolean canAct() {
        if (decoratedRole.canAct()) {
            System.out.println("We can act!");
            deal(decoratedRole);
        } else {
            System.out.println("We cannot act!");
        }
        return decoratedRole.canAct();
    }

    private void deal(Role decoratedRole) {
        System.out.println("Dealed cards Success!");
    }
}