import java.util.*;
import java.io.*;

public class Triple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[n];
            
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }
            
            // Use a frequency map to count occurrences
            Map<Integer, Integer> freq = new HashMap<>();
            int result = -1;
            
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
                // Check if current number appears at least 3 times
                if (freq.get(num) >= 3) {
                    result = num;
                    break; // Found our answer, no need to continue
                }
            }
            
            System.out.println(result);
        }
    }
}