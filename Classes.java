// Constructor - name of the constructor is same as the class name
// Constructor is used to initialize the object
// Constructor is called automatically when an object is created
// Constructor have no return type
// Constructor can be overloaded
// Constructor supports public, private, protected, and default access modifiers
// Constructor are not inherited
// constructor can call another constructor in same class using this()
// constructor can call parent constructor using super()
// constructor cannot be static, final, or abstract
// 
// ============= Types of constructors =============
// 1) default
// 2) parameterized
// 3) copy
// 4) no-arg
// 
// ============= This Keyword in constructors =============
// "this" Keyword - it is used with class attributes which have the same name as method or constructor parameters
// it is used to refer to the current object
// when we want to call another constructor from another constructor in same class, we use this()
// 
// this is parameterized constructor
// 
// ============= Getters and Setters =============
// They are used to get and set the values of private attributes
// They are used to encapsulate the data and provide controlled access to it
// Setter - They are used to set the values of private attributes
// Getter - They are used to get the values of private attributes
// EG Setter: public void setRoll(int roll) { this.roll = roll; }
// EG Getter: public int getRoll() { return roll; }

class Student {
    int roll, age;
    String name;


    public Student(int roll, String name, int age) {
        System.out.println("Constructor 1 called");
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public Student(int roll, String name) {
        this(roll, name, 20);
        System.out.println("Constructor 2 called");
    }

    public Student(int roll) {
        System.out.println("Constructor 3 called");
        this.roll = roll;
        this.name = "";
        this.age = 0;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println(roll + " " + name + " " + age);
    }
}

public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Stu1", 30);
        Student s2 = new Student(2, "Stu2", 25);
        Student s3 = new Student(3, "Stu3", 28);

        s1.display();
        s2.display();
        s3.display();
    }
}
