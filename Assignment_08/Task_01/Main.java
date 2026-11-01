// Create class Student with int roll, String name and method show() that prints Roll: and the roll, then Name: and the name.
// In main, create a Student with roll 5 and name Rohan and call show().

class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 5;
        s.name = "Rohan";
        s.show();
    }
}
