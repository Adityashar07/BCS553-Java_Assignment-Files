// Write the method int power(int base, int exp) using recursion.
// When exp is 0 the answer is 1; otherwise the answer is base times power(base, exp-1).
// Print power(2,5).


public class Main {
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
