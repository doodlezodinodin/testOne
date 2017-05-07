package ua.projects.pattern.facade;

/**
 * Created by alex on 07.05.2017.
 */
public class FacadeApp {
    public void execute() {
        Facade facade = new Facade();
        facade.execute();
    }
}

class Facade {
    Computer computer = new Computer();

    public void execute() {
        computer.on();
        computer.off();
        computer.reset();
    }
}

class Computer {
    public void on() {
        System.out.println("on");
    }
    public void off() {
        System.out.println("off");
    }
    public void reset() {
        System.out.println("reset");
    }
}
