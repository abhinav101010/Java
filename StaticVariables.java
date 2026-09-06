/**
 * StaticVariables
 */

class A {
    static int staticVar = 10;
    void increment() {
        staticVar++;
    }

    void printStaticVar() {
        System.out.println(staticVar);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        A a = new A();
        a.increment();
        a.printStaticVar();
        A b = new A();
        b.printStaticVar();
    }
}