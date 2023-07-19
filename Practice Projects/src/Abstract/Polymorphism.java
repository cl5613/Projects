package Abstract;

public class Polymorphism {

    //多态

    public static void main(String[] args) {
        //多象多态
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        //superclass    //subclass

        useAnimal(new Cat());  //cat and dog inherited animal
        useAnimal(new Dog());
    }

    public static void useAnimal(Animal a) {
        a.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}