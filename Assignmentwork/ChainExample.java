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

public class ChainExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Mounika", 95),
                new Student("Lahari", 50),
                new Student("Jyothi", 89),
                new Student("Gowthami", 90),
                new Student("Rajitha", 55)
        );

        List<String> result = students.stream()
                .filter(s -> s.marks > 60)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}