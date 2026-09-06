/**
 * Inheritance
 */

class Animal {
    String name;
    int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
        super.eat();
    }
    
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}