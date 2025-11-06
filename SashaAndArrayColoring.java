import java.util.*;

public class SashaAndArrayColoring {
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
            int sum = 0;
            for (int i = 0; i < n / 2; i++) {
                sum += arr[n - 1 - i] - arr[i];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}