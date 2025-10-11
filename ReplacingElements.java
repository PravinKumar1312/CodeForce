import java.util.*;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Check if all elements are already <= d
            boolean allGood = true;
            for (int num : arr) {
                if (num > d) {
                    allGood = false;
                    break;
                }
            }

            if (allGood) {
                System.out.println("YES");
                continue;
            }

            // Find the two smallest elements
            Arrays.sort(arr);
            int smallestSum = arr[0] + arr[1];

            // If we can replace problematic elements using the two smallest
            if (smallestSum <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}