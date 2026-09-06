class Person {
    private int age;
    String name;
    
    public Person(int age, String name) {
        if(age<0 || age>120){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ClassesQ18 {
    public static void main(String[] args) {
        Person person = new Person(30, "John");
        person.setAge(150);
        person.setAge(35);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}