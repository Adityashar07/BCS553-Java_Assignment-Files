// Create class Counter with int field count, set to 0 by its constructor, and method increment() that adds 1 to count.
// In main, create a Counter, call increment() three times and print Count: followed by the value.

class Counter {
    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}
