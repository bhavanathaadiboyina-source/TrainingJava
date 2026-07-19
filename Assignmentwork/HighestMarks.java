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

public class HighestMarks {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Mounika", 95),
                new Student("Lahari", 90),
                new Student("Jyothi", 89),
                new Student("Gowthami", 90),
                new Student("Rajitha", 80)
        );

        Student top = students.stream()
                .max(Comparator.comparingInt(s -> s.marks))
                .orElse(null);

        System.out.println("Top Student: " + top.name);
        System.out.println("Marks: " + top.marks);
    }
}