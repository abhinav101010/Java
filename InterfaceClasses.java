interface Animal {
    void makeSound();
}

interface LivingThing {
    void eat();
    void sleep();
}

class Dog implements Animal, LivingThing {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
        dog.eat();
        dog.sleep();
    }
}

public class InterfaceClasses {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        dog.sleep();
    }
}