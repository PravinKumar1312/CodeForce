import java.util.*;

public class LectureSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            t[i] = sc.nextInt();

        long[] prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
        }

        long base = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                base += a[i];
            }
        }

        long maxGain = 0;
        for (int i = 0; i <= n - k; i++) {
            long windowSum = prefix[i + k] - prefix[i];

            long actualGain = 0;
            for (int j = i; j < i + k; j++) {
                if (t[j] == 1) {
                    actualGain += a[j];
                }
            }

            long gain = windowSum - actualGain;
            maxGain = Math.max(maxGain, gain);
        }

        System.out.println(base + maxGain);
        sc.close();
    }
}