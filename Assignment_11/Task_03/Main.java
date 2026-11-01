// Create class Shape with int area() returning 0, class Square extending Shape with int side, area() returning side times side.
// In main, create a Square with side to 3, store it in a Shape variable and print Area: followed by the value.

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
        Square square = new Square();
        square.side = 3;
        Shape s = square;
        System.out.println("Area: " + s.area());
    }
}
