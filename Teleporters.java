import java.util.*;

public class Teleporters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Create pairs of (cost, index)
            long[][] costs = new long[n][2];
            for (int i = 0; i < n; i++) {
                // Total cost to use teleporter i: a[i] + (i + 1)
                // since positions are 1-indexed in the problem
                costs[i][0] = a[i] + (i + 1);
                costs[i][1] = i;
            }

            // Sort by total cost
            Arrays.sort(costs, (x, y) -> Long.compare(x[0], y[0]));

            int result = 0;
            long totalCost = 0;

            for (int i = 0; i < n; i++) {
                if (totalCost + costs[i][0] <= c) {
                    totalCost += costs[i][0];
                    result++;
                } else {
                    break;
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}