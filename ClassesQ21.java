abstract class Shape {
    abstract double area();
    abstract void displayShape();
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    void displayShape() {
        System.out.println("Circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void displayShape() {
        System.out.println("Rectangle with length " + length + " and width " + width);
    }
    
    @Override
    double area() {
        return length * width;
    }
}

public class ClassesQ21 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        circle.displayShape();
        rectangle.displayShape();
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}