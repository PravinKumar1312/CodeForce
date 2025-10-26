import java.util.*;

public class LessOrEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);

        // Case 1: k = 0
        if (k == 0) {
            // x must be < smallest element, but x ≥ 1
            if (arr[0] > 1) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
            return;
        }

        // Case 2: k = n
        if (k == n) {
            // x can be any number ≥ largest element, but x ≤ 10^9
            // If largest element is already 10^9, we can't go higher
            if (arr[n - 1] <= 1000000000) {
                System.out.println(arr[n - 1]);
            } else {
                System.out.println(-1);
            }
            return;
        }

        // General case: check if k-th and (k+1)-th elements are different
        if (arr[k - 1] != arr[k]) {
            // Output arr[k-1] + 1 to match the sample behavior
            System.out.println(arr[k - 1]);
        } else {
            System.out.println(-1);
        }
    }
}