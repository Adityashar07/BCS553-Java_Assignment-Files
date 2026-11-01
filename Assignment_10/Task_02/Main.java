// Create class Person with field name, set by a constructor.
// Create class Student extending Person, whose constructor takes a name and calls super(name).
// In main create a Student named Neha and print Name: followed by the name.

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}
