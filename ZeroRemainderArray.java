import java.util.*;

public class ZeroRemainderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Map<Long, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long r = (k - a[i] % k) % k;
                if (r != 0) {
                    freq.put(r, freq.getOrDefault(r, 0) + 1);
                }
            }
            if (freq.isEmpty()) {
                System.out.println(0);
                continue;
            }
            long max = 0;
            for (Map.Entry<Long, Integer> entry : freq.entrySet()) {
                long r = entry.getKey();
                int count = entry.getValue();
                long candidate = r + k * (count - 1);
                if (candidate > max) {
                    max = candidate;
                }
            }
            System.out.println(max + 1);
        }
        sc.close();

    }
}