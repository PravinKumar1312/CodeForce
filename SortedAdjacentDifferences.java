import java.util.*;

public class SortedAdjacentDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            // Find the middle index
            int mid = (n - 1) / 2;

            // Create result array
            int[] result = new int[n];
            int left = mid;
            int right = mid + 1;
            int idx = 0;

            // Alternate between left and right
            boolean takeFromLeft = true;

            while (idx < n) {
                if (takeFromLeft && left >= 0) {
                    result[idx++] = arr[left--];
                } else if (right < n) {
                    result[idx++] = arr[right++];
                }
                takeFromLeft = !takeFromLeft;
            }

            // Print the result
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}