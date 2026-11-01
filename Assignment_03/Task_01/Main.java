// Run one pass of bubble sort on {5,1,4,2,8}. 
// In the pass, compare each value with the next and swap when the left one is larger.
// Print each value of the array on its own line.

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        for (int value : a) System.out.println(value);
    }
}
