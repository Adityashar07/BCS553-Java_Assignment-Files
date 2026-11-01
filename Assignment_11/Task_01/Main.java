// Create class Shape with int area() returning 0, and class Square extending Shape with int field side and area() returning side times side.
// In main, create a Square, set side to 4, and print Area: followed by the value.

class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 4;
        System.out.println("Area: " + s.area());
    }
}
