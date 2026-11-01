// Create the array int[] marks = {45,67,80,52,90}. Print First: followed by the first value and Last: 
// following by the last value, on two lines using indexes.

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        System.out.println("First: " + marks[0]);
        System.out.println("Last: " + marks[marks.length - 1]);
    }
}
