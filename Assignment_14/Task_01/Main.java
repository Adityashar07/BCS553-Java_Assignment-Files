// Write the method boolean isSorted(int[] a, int i) that returns true when the values from index i to the end are in ascending order.
// Call it on {2,4,6,8,10} with i = 0 and print the result.

public class Main {
    static boolean isSorted(int[] a, int i) {
        if (i >= a.length - 1) return true;
        if (a[i] > a[i + 1]) return false;
        return isSorted(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(isSorted(a, 0));
    }
}
