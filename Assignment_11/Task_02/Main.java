// Create class Shape with int area() returning 0, and class Rectangle extending Shape with int length and breadth, area() returning length times breadth.
// In main, create a Rectangle with length 4 and breadth 5, and print Area: followed by the value.

class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}
