package Test;

import Inheritance.Coder;
import Inheritance.Manager;

public class TestInheritance {

    public static void main(String[] args) {
        Coder c = new Coder("me", 21, 4000);
        c.work();

        Manager m = new Manager("you", 30, 10000, 500);
        m.work();

    }
}

