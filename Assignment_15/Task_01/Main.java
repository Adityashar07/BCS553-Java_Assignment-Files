// Print all subsets of {1,2,3} using recursion. At each index, first skip the value, then include it.
// At the end, print the subset in braces, for example {1,3}, and print{} for the empty subset.

public class Main {
    static int[] a = {1, 2, 3};
    static boolean[] included = new boolean[a.length];

    static void printSubset(int index) {
        if (index == a.length) {
            System.out.print("{");
            boolean first = true;
            for (int i = 0; i < a.length; i++) {
                if (included[i]) {
                    if (!first) System.out.print(", ");
                    System.out.print(a[i]);
                    first = false;
                }
            }
            System.out.println("}");
            return;
        }

        included[index] = false;
        printSubset(index + 1); // First skip the current value.
        included[index] = true;
        printSubset(index + 1); // Then include the current value.
        included[index] = false;
    }

    public static void main(String[] args) {
        printSubset(0);
    }
}
