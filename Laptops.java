import java.util.*;
import java.io.*;

public class Laptops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] laptops = new int[n][2];
        
        // Read input
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            laptops[i][0] = Integer.parseInt(parts[0]); // price
            laptops[i][1] = Integer.parseInt(parts[1]); // quality
        }
        
        // Sort by price
        Arrays.sort(laptops, (a, b) -> a[0] - b[0]);
        
        // Check if quality is strictly increasing
        boolean happyAlex = false;
        for (int i = 1; i < n; i++) {
            if (laptops[i][1] < laptops[i - 1][1]) {
                happyAlex = true;
                break;
            }
        }
        
        System.out.println(happyAlex ? "Happy Alex" : "Poor Alex");
    }
}