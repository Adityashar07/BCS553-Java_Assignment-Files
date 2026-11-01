// Sort the array {64,25,12,22,11} with selection sort.
// For each position, swap in the smallest value of the rest.
// Print each value of the sorted array on its own line.

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int value : a) System.out.println(value);
    }
}
