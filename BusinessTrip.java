import java.util.*;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int[] months = new int[12];

        for (int i = 0; i < 12; i++) {
            months[i] = scanner.nextInt();
        }
        scanner.close();

        // If k is 0, no watering needed
        if (k == 0) {
            System.out.println(0);
            return;
        }

        // Sort in descending order to use highest growth months first
        Arrays.sort(months);

        int totalGrowth = 0;
        int count = 0;

        // Start from the largest month (end of sorted array)
        for (int i = 11; i >= 0; i--) {
            totalGrowth += months[i];
            count++;

            // If we've reached the required growth, we're done
            if (totalGrowth >= k) {
                System.out.println(count);
                return;
            }
        }

        // If we went through all months and still didn't reach k
        System.out.println(-1);

    }
}