// Create class Box with int field width and a constructor with no parameters that sets width using this width.
// In main, create a Box with 25 and print Width: followed by the value.

class Box {
    int width;

    Box(int width) {
        this.width = width;
    }
}

public class Main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}
