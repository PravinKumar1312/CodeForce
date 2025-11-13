import java.util.*;

public class PashmakAndFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        Arrays.sort(b);

        long maxDiff = b[n - 1] - b[0];
        long ways = 0;

        if (maxDiff == 0) {
            // All flowers are the same
            ways = (long) n * (n - 1) / 2;
        } else {
            long minCount = 0;
            long maxCount = 0;

            // Count how many flowers have minimum beauty
            for (int i = 0; i < n; i++) {
                if (b[i] == b[0]) {
                    minCount++;
                } else {
                    break;
                }
            }

            // Count how many flowers have maximum beauty
            for (int i = n - 1; i >= 0; i--) {
                if (b[i] == b[n - 1]) {
                    maxCount++;
                } else {
                    break;
                }
            }

            ways = minCount * maxCount;
        }

        System.out.println(maxDiff + " " + ways);
        sc.close();
    }
}