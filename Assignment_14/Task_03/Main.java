// Write the method int fib(int n) using recursion, where fib(0) is 0, fib(1) is 1, and otherwise fib(n) is fib(n-1) plus fib(n-2).
// print fib(7).

public class Main {
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
