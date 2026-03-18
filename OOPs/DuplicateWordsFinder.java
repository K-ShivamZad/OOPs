import java.util.HashMap;
import java.util.HashSet;

public class DuplicateWordsFinder {
    public static void main(String[] args) {
        String givenStatement = "Java and Javascript are totally different, Javascript follows Java";
        printDuplicateWords(givenStatement);
    }

    public static void printDuplicateWords(String statement) {
        if (statement == null || statement.isEmpty()) {
            System.out.println("No duplicate words found. String is null or empty.");
            return;
        }

        // Split the statement into words
        String[] words = statement.toLowerCase().split("\\W+"); // Split using non-word characters and convert to lowercase
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        HashSet<String> duplicateWords = new HashSet<>();
        for (String word : wordCountMap.keySet()) {
            if (wordCountMap.get(word) > 1) {
                duplicateWords.add(word);
            }
        }

        if (duplicateWords.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            System.out.println("Duplicate words in the given statement are:");
            for (String duplicate : duplicateWords) {
                System.out.println(duplicate);
            }
        }
    }
}
