import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String x = scanner.next();
            String s = scanner.next();

            int operations = 0;
            boolean found = false;

            // We'll try up to 6 operations (since 2^6 * 25 is large enough)
            while (x.length() <= 100) { // Reasonable upper bound
                if (x.contains(s)) {
                    found = true;
                    break;
                }

                // If x is already longer than s and doesn't contain it,
                // and we've done a few operations, it's probably impossible
                if (x.length() >= m && operations >= 5) {
                    break;
                }

                // Apply operation: append x to itself
                x += x;
                operations++;
            }

            if (found) {
                System.out.println(operations);
            } else {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}