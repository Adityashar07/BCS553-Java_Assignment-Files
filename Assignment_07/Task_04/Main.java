// Use a for loop and an if statement to print each value in {1,2,3,4}, one per line.
// A value is even when value % 2 is 0.

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int value : a) {
            if (value % 2 == 0) System.out.println(value);
        }
    }
}
