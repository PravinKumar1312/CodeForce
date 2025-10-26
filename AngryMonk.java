import java.util.*;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            int k = scanner.nextInt();

            int ones = 0;
            for (int i = 0; i < k; i++) {
                long a = scanner.nextLong();
                if (a == 1) {
                    ones++;
                }
            }

            long ans;
            if (ones >= k - 1) {
                ans = k - 1;
            } else {
                ans = 3L * (k - 1) - 2L * ones;
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}