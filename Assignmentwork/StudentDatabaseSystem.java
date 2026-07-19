import java.util.*;

public class StudentDatabaseSystem {
    public static void main(String[] args) {

        // Student names (same student may appear multiple times)
        String students = "Mounik lahari Mounika jyothi Mounika jyothi bhavana Mounika";

        // Split the string into student names
        String[] names = students.split(" ");

        // Store names in a List
        List<String> studentList = new ArrayList<>();
        for (String name : names) {
            studentList.add(name);
        }

        // HashMap to store frequency
        HashMap<String, Integer> studentCount = new HashMap<>();

        // Count occurrences
        for (String name : studentList) {
            if (studentCount.containsKey(name)) {
                studentCount.put(name, studentCount.get(name) + 1);
            } else {
                studentCount.put(name, 1);
            }
        }

        // Set to display unique student names
        Set<String> studentSet = studentCount.keySet();

        System.out.println("Student Database:");
        System.out.println(students);

        System.out.println("\nStudent Record Count:");
        for (String name : studentSet) {
            System.out.println(name + " = " + studentCount.get(name));
        }
    }
}