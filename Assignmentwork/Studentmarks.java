import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Studentmarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Mounika", 95),
                new Student("Lahari", 85),
                new Student("Jyothi", 80),
                new Student("Gowtami", 90),
                new Student("Rajitha", 55)
        );

        students.stream()
                .filter(s -> s.marks > 60)
                .forEach(s -> System.out.println(s.name + " - " + s.marks));
    }
}