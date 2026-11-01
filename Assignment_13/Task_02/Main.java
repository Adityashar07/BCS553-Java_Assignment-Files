// Write the method int max(int[] a, int i) that returns the largest value from index i to the end.
// Call it on {3,6,9,12,15} with i = 0 and print the result.

public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        return Math.max(a[i], max(a, i + 1));
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
