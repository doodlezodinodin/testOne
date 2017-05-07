package ua.projects.pattern.strategy;

/**
 * Created by alex on 07.05.2017.
 */
public class StrategyApp {
    public void execute() {
        Money money = new UAH();
        money.printMoney();

        money = new USD();
        money.printMoney();

        money = new RUB();
        money.printMoney();
    }
}

interface Money {
    void printMoney();
}

class UAH implements Money {
    public void printMoney() {
        System.out.println("print UAH");
    }
}

class USD implements Money {
    public void printMoney() {
        System.out.println("print USD");
    }
}

class RUB implements Money {
    public void printMoney() {
        System.out.println("print RUB");
    }
}

