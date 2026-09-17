package Assignment1;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
    abstract String name();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    double perimeter() {
        return 2 * Math.PI * r;
    }

    String name() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    String name() {
        return "Rectangle";
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }

    String name() {
        return "Square";
    }
}

public class Q6 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(10, 12),
            new Square(10),
            new Circle(3),
            new Rectangle(8, 6),
            new Square(7)
        };

        Shape maxArea = shapes[0];
        Shape minPerimeter = shapes[0];

        for (Shape s : shapes) {
            System.out.println(s.name());
            System.out.println("Area = " + s.area());
            System.out.println("Perimeter = " + s.perimeter());

            if (s.area() > maxArea.area())
                maxArea = s;

            if (s.perimeter() < minPerimeter.perimeter())
                minPerimeter = s;
        }

        System.out.println("Shape with maximum area: " + maxArea.name());
        System.out.println("Shape with minimum perimeter: " + minPerimeter.name());
    }
}