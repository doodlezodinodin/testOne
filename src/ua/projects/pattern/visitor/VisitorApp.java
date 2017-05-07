package ua.projects.pattern.visitor;

/**
 * Created by alex on 07.05.2017.
 */
public class VisitorApp {
    public void execute() {

        Deagle deagle = new Deagle();
        Visitor master = new Master();

        deagle.accept(master);
        master.visit(deagle);

        System.out.println(deagle.getCartridges());
        System.out.println(deagle.getRecharge());
    }
}

interface Visitor {
    void visit(Deagle deagle);
}

class Master implements Visitor {
    public void visit(Deagle deagle) {
        deagle.setCartridges(12);
        deagle.setRecharge(true);
    }
}

interface Element {
    void accept(Visitor visitor);
}

class Deagle implements Element {

    private int cartridges;
    private boolean recharge;

    public int getCartridges() {
        return cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }

    public boolean getRecharge() {
        return recharge;
    }

    public void setRecharge(boolean recharge) {
        this.recharge = recharge;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
