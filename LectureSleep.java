import java.util.*;

public class LectureSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] theorems = new int[n];
        int[] behavior = new int[n];

        // Read theorems
        for (int i = 0; i < n; i++) {
            theorems[i] = sc.nextInt();
        }

        // Read behavior
        for (int i = 0; i < n; i++) {
            behavior[i] = sc.nextInt();
        }

        // Calculate base theorems (when Mishka is naturally awake)
        int baseTheorems = 0;
        for (int i = 0; i < n; i++) {
            if (behavior[i] == 1) {
                baseTheorems += theorems[i];
            }
        }

        // Calculate gain for first window [0, k-1]
        int windowGain = 0;
        for (int i = 0; i < k; i++) {
            if (behavior[i] == 0) {
                windowGain += theorems[i];
            }
        }

        int maxGain = windowGain;

        // Slide the window and update maximum gain
        for (int i = k; i < n; i++) {
            // Remove element leaving the window
            if (behavior[i - k] == 0) {
                windowGain -= theorems[i - k];
            }
            // Add new element entering the window
            if (behavior[i] == 0) {
                windowGain += theorems[i];
            }
            maxGain = Math.max(maxGain, windowGain);
        }

        // Total = base theorems + maximum additional gain from technique
        int result = baseTheorems + maxGain;
        System.out.println(result);

        sc.close();
    }
}