import java.util.*;

public class Bogosort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Integer[] sorted = new Integer[n];
            for (int i = 0; i < n; i++) {
                sorted[i] = arr[i];
            }

            Arrays.sort(sorted, Collections.reverseOrder());

            // Output the sorted array
            for (int i = 0; i < n; i++) {
                System.out.print(sorted[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}