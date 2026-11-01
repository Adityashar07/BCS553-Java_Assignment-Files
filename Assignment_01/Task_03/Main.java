// Create the array int[] marks = {45,67,80,52,90}. 
// Add all the values with a loop and print the total as Sum: followed by the total.

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Sum: " + sum);
    }
}
