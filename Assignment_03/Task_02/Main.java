// Sort the array {5,1,4,2,8} with bubble sort, using one outer loop for the passes and one inner loop for the comparisons. 
// Print each value of the sorted array on its own line.

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        for (int pass = 0; pass < a.length - 1; pass++) {
            for (int j = 0; j < a.length - 1 - pass; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int value : a) System.out.println(value);
    }
}
