// Write the method int sum(int n) using recursion that adds the numbers from 1 to n.
// Print sum(10).

public class Main {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
