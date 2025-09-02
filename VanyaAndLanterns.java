import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        double maxGap = 0;
        for (int i = 1; i < n; i++) {
            int gap = a[i] - a[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        double d = Math.max(a[0], l - a[n - 1]);
        d = Math.max(d, maxGap / 2.0);
        System.out.printf("%.10f\n", d);

        scanner.close();
    }
}
