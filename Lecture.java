import java.util.*;
import java.io.*;

public class Lecture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        // Read n and m
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        
        // Create a map to store word mappings
        Map<String, String> wordMap = new HashMap<>();
        
        // Read the m word pairs
        for (int i = 0; i < m; i++) {
            String[] pair = br.readLine().split(" ");
            String firstLang = pair[0];
            String secondLang = pair[1];
            
            // Store mapping in both directions
            wordMap.put(firstLang, secondLang);
            wordMap.put(secondLang, firstLang);
        }
        
        // Read the lecture words
        String[] lectureWords = br.readLine().split(" ");
        
        // Process each word in the lecture
        for (int i = 0; i < n; i++) {
            String currentWord = lectureWords[i];
            String correspondingWord = wordMap.get(currentWord);
            
            // Choose the shorter word, or first language word if equal length
            if (correspondingWord.length() < currentWord.length()) {
                pw.print(correspondingWord);
            } else {
                pw.print(currentWord);
            }
            
            // Add space if not the last word
            if (i < n - 1) {
                pw.print(" ");
            }
        }
        
        pw.println();
        pw.flush();
    }
}