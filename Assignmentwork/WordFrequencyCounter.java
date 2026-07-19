import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        // Input sentence
        String text = "i am learning java";

        // Convert to lowercase and split into words
        String[] words = text.toLowerCase().split(" ");

        // HashMap to store word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Display the original text
        System.out.println("Input Text:");
        System.out.println(text);

        // Display word frequencies
        System.out.println("\nWord Frequency:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " = " + wordCount.get(word));
        }
    }
}