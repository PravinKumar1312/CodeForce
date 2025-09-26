import java.util.*;

public class MinimizeThickness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(getMinThickness(a));
        }
        sc.close();
    }

    private static int getMinThickness(int[] a) {
        int n = a.length;
        int totalSum = 0;
        for (int num : a)
            totalSum += num;
        int minThickness = n;

        // Try all possible prefix sums as possible segment sums
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += a[i];
            int segmentSum = prefixSum;
            int pos = i + 1;
            int curSum = 0;
            int curLen = 0;
            int maxLen = i + 1;
            boolean valid = true;
            for (int j = pos; j < n; j++) {
                curSum += a[j];
                curLen++;
                if (curSum > segmentSum) {
                    valid = false;
                    break;
                } else if (curSum == segmentSum) {
                    maxLen = Math.max(maxLen, curLen);
                    curSum = 0;
                    curLen = 0;
                }
            }
            if (curSum == 0 && valid) {
                minThickness = Math.min(minThickness, maxLen);
            }
        }
        return minThickness;
    }
}
