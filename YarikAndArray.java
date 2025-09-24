import java.util.*;

public class YarikAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long maxSum = arr[0];
            long currentSum = arr[0];

            for (int i = 1; i < n; i++) {
                // Check if current element has different parity than previous
                if (Math.abs(arr[i] % 2) != Math.abs(arr[i - 1] % 2)) {
                    // Extend the subarray
                    currentSum = Math.max(arr[i], currentSum + arr[i]);
                } else {
                    // Start a new subarray
                    currentSum = arr[i];
                }

                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println(maxSum);
        }

        sc.close();
    }
}