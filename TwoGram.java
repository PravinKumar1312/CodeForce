import java.util.*;

public class TwoGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next();
        
        // Use a map to store frequency of each two-gram
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Generate all two-grams and count their frequency
        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);
            frequencyMap.put(twoGram, frequencyMap.getOrDefault(twoGram, 0) + 1);
        }
        
        // Find the two-gram with maximum frequency
        String maxTwoGram = "";
        int maxFrequency = 0;
        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxTwoGram = entry.getKey();
            }
        }
        
        System.out.println(maxTwoGram);
        scanner.close();
    }
}