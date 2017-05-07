package ua.projects.pattern.state;

/**
 * Created by alex on 07.05.2017.
 */
public class StateApp {
    public void execute() {
        User user = new User();

        for (int i = 0; i < 10; i++) {
            user.print();
            user.nextMoney();
        }
    }
}

interface Money {
    void printMoney();
}

class UAH implements Money {
    public void printMoney() {
        System.out.println("uah");
    }
}

class USD implements Money {
    public void printMoney() {
        System.out.println("usd");
    }
}

class RUB implements Money {
    public void printMoney() {
        System.out.println("rub");
    }
}

class User {
    Money money = new UAH();

    public void print() {
        money.printMoney();
    }

    public void nextMoney() {
        if (money instanceof UAH) {
            money = new USD();
        } else if (money instanceof USD) {
            money = new RUB();
        } else money = new UAH();
    }
}
