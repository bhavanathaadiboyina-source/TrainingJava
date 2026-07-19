import java.util.ArrayList;
import java.util.Iterator;

class Course {
    private String code;
    private String name;
    private int credits;

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public String toString() {
        return code + " - " + name + " - " + credits + " Credits";
    }
}

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<>();

        // Add
        courses.add(new Course("CS101", "Java", 4));
        courses.add(new Course("CS102", "Python", 3));
        courses.add(new Course("CS103", "DBMS", 4));

        System.out.println("Courses: " + courses);

        // Add at specific position
        courses.add(1, new Course("CS104", "AI", 5));
        System.out.println("\nAfter Insert:");
        System.out.println(courses);

        // Add All
        ArrayList<Course> moreCourses = new ArrayList<>();
        moreCourses.add(new Course("CS105", "Cloud", 3));
        moreCourses.add(new Course("CS106", "Cyber Security", 4));

        courses.addAll(moreCourses);
        System.out.println("\nAfter addAll:");
        System.out.println(courses);

        // Get
        System.out.println("\nFirst Course: " + courses.get(0));

        // Remove
        courses.remove(1);
        System.out.println("\nAfter Remove:");
        System.out.println(courses);

        // Remove If
        courses.removeIf(c -> c.getCode().equals("CS106"));
        System.out.println("\nAfter removeIf:");
        System.out.println(courses);

        // Find Course
        System.out.println("\nFind Course (CS103):");
        for (Course c : courses) {
            if (c.getCode().equals("CS103")) {
                System.out.println(c);
            }
        }

        // Total Credits
        int total = 0;
        for (Course c : courses) {
            total += c.getCredits();
        }
        System.out.println("\nTotal Credits = " + total);

        // Size
        System.out.println("Size = " + courses.size());

        // isEmpty
        System.out.println("Is Empty = " + courses.isEmpty());

        // For-each Loop
        System.out.println("\nFor-Each Loop");
        for (Course c : courses) {
            System.out.println(c);
        }

        // Traditional For Loop
        System.out.println("\nTraditional For Loop");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }

        // Iterator
        System.out.println("\nIterator");
        Iterator<Course> it = courses.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Lambda
        System.out.println("\nLambda");
        courses.forEach(c -> System.out.println(c));

        // Clear
        courses.clear();
        System.out.println("\nAfter Clear: " + courses);
        System.out.println("Is Empty = " + courses.isEmpty());
    }
}