package ua.projects.pattern.factoryMethod;

/**
 * Created by alex on 07.05.2017.
 */
public class FactoryMethodApp {
    public void execute() {
        AB a = new FactoryB().create();
        a.dodo();
    }
}

interface AB {
    void dodo();
}

class A implements AB{
    public void dodo() {
        System.out.println("A: do");
    }
}

class B implements AB{
    public void dodo() {
        System.out.println("B: do");
    }
}

interface Factory {
    AB create();
}

class FactoryA implements Factory {
    public AB create() {
        return new A();
    }
}

class FactoryB implements Factory {
    public AB create() {
        return new B();
    }
}
