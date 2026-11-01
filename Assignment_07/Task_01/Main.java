// Search for the value 52 in the array {45, 52,80} with a loop. 
// If 52 is there, print Found at index following by a space and the index.
// If it is not there, print Not Found.

public class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                index = i;
                break;
            }
        }
        if (index != -1) System.out.println("Found at index " + index);
        else System.out.println("Not found");
    }
}
