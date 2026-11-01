// Write the method int factorial(int n) using recursion.
// The factorial of 0 is 1, and n times factorial(n-1) is the other case.
// Print factorial(5).

public class Main {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
