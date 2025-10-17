import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt(); // Kirito's initial strength
        int n = scanner.nextInt(); // number of dragons

        // Create a 2D array to store dragon strengths and bonuses
        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = scanner.nextInt(); // dragon strength
            dragons[i][1] = scanner.nextInt(); // bonus
        }

        // Sort dragons by their strength in ascending order
        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);

        boolean canWin = true;
        int currentStrength = s;

        for (int i = 0; i < n; i++) {
            int dragonStrength = dragons[i][0];
            int bonus = dragons[i][1];

            // If Kirito can defeat this dragon
            if (currentStrength > dragonStrength) {
                currentStrength += bonus;
            } else {
                canWin = false;
                break;
            }
        }

        System.out.println(canWin ? "YES" : "NO");

        scanner.close();
    }
}