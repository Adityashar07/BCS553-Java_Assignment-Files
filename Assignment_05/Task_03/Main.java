// Count how many times the value 52 appears in the array {52,10,52,7,52}.
// Print the count as Count: followed by the number.

public class Main {
    public static void main(String[] args) {
        int[] a = {52, 10, 52, 7, 52};
        int count = 0;
        for (int value : a) {
            if (value == 52) count++;
        }
        System.out.println("Count: " + count);
    }
}
