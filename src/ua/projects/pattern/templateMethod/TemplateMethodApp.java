package ua.projects.pattern.templateMethod;

/**
 * Created by alex on 07.05.2017.
 */
public class TemplateMethodApp {
    public void execute() {
        A a = new A();
        a.print();

        System.out.println();

        B b = new B();
        b.print();
    }
}

abstract class Template {
    public void print() {
        System.out.println("1");
        two();
        three();
        System.out.println("4");
    }

    abstract void two();
    abstract void three();
}

class A extends Template {
    public void two() {
        System.out.println("2");
    }

    public void three() {

    }
}

class B extends Template {
    public void two() {

    }

    public void three() {
        System.out.println("3");
    }
}