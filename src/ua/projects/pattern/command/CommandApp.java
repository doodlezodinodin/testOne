package ua.projects.pattern.command;

/**
 * Created by alex on 07.05.2017.
 */
public class CommandApp {
    public void execute() {
        Computer computer = new Computer();
        User user = new User(new On(computer), new Off(computer), new Reset(computer));

        user.on();
        user.off();
        user.reset();
    }
}

class Computer {
    public void on() {
        System.out.println("computer on");
    }

    public void off() {
        System.out.println("computer off");
    }

    public void reset() {
        System.out.println("computer reset");
    }
}

abstract class CommandComputer {
    Computer computer;
}

class On extends CommandComputer {
   public On(Computer computer) {
       this.computer = computer;
   }

   public void commandOn() {
       computer.on();
   }
}

class Off extends CommandComputer {
    public Off(Computer computer) {
        this.computer = computer;
    }

    public void commandOff() {
        computer.off();
    }
}

class Reset extends CommandComputer {
    public Reset(Computer computer) {
        this.computer = computer;
    }

    public void commandReset() {
        computer.reset();
    }
}

class User {
    private On on;
    private Off off;
    private Reset reset;

    public User(On on, Off off, Reset reset) {
        this.on = on;
        this.off = off;
        this.reset = reset;
    }

    public void on() {
        on.commandOn();
    }

    public void off() {
        off.commandOff();
    }

    public void reset() {
        reset.commandReset();
    }
}
