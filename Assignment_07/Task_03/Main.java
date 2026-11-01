// Use a for loop to multiply all the values of {2,3,4} and print product as Product: followed by the number.

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int product = 1;
        for (int value : a) product *= value;
        System.out.println("Product: " + product);
    }
}
