/**
 * AbstractClasses
 * Difference b/w Abstract Classes and Interfaces
 * 
 * Abstract Classes :-
 * 1) it is a class that cannot be instantiated and may contain abstract and concrete methods
 * 2) it specifies what methods must be implemented by subclasses
 * 3) in traditional versions only abstract methods can be there in interfaces, 
 * but in newer versions interface can have default and static methods
 * 4) abstract class can have instance variables with any access specifier
 * but in interfaces, instance variables are usually public, static and final
 * 5) abstract class can have constructors, but interfaces cannot 
 * 6) a class can extent only one abstract class where as it can implement multiple interfaces
 * 
 * 
 * 
 * 
 */

 /**
  * InnerAbstractClasses
  */
abstract class InnerAbstractClasses {
    public abstract void doSomething();
}

class ConcreteClass extends InnerAbstractClasses {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        InnerAbstractClasses inner = new ConcreteClass();
        inner.doSomething();
    }
}
