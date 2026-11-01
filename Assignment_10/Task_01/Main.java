// Create class Animal with method sound() that prints "Some sound".
// Create class Dog that extends Animal with no other code.
// In main, create a Dog and call sound() on it.

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
