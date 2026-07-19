import java.util.*;

public class WordFrequencyCounter1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Store words in a List
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }

        // HashMap to store word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count frequency
        for (String word : wordList) {
            if (wordCount.containsKey(wojavard)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Set to store unique words
        Set<String> uniqueWords = wordCount.keySet();

        // Display input sentence
        System.out.println("\nInput Sentence:");
        System.out.println(sentence);

        // Display List
        System.out.println("\nList of Words:");
        System.out.println(wordList);

        // Display Set
        System.out.println("\nUnique Words (Set):");
        System.out.println(uniqueWords);

        // Display HashMap
        System.out.println("\nWord Frequency (HashMap):");
        for (String word : uniqueWords) {
            System.out.println(word + " = " + wordCount.get(word));
        }

        sc.close();
    }
}