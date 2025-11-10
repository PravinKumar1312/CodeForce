import java.util.*;

public class ChoosingCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int favValue = a[f - 1];

            // Count cubes with value greater than favorite cube
            int greater = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > favValue) {
                    greater++;
                }
            }

            // Count cubes with value equal to favorite cube (including the favorite one)
            int equal = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == favValue) {
                    equal++;
                }
            }

            // If all greater cubes are already >= k, favorite cube cannot be in first k
            if (greater >= k) {
                System.out.println("NO");
            }
            // If all greater + all equal cubes <= k, favorite cube will always be in first
            // k
            else if (greater + equal <= k) {
                System.out.println("YES");
            }
            // Otherwise, it depends on tie-breaking
            else {
                System.out.println("MAYBE");
            }
        }
        scanner.close();
    }
}