import java.util.Arrays;
import java.util.Scanner;

public class BalancedTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        int left = 0;
        int maxTeam = 0;
        for (int right = 0; right < n; right++) {
            while (a[right] - a[left] > 5) {
                left++;
            }
            maxTeam = Math.max(maxTeam, right - left + 1);
        }

        System.out.println(maxTeam);
        scanner.close();
    }
}