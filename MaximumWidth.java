import java.util.*;

public class MaximumWidth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        // Arrays to store leftmost and rightmost positions
        int[] left = new int[m];
        int[] right = new int[m];

        // Compute leftmost positions
        int pos = 0;
        for (int i = 0; i < n && pos < m; i++) {
            if (s.charAt(i) == t.charAt(pos)) {
                left[pos] = i;
                pos++;
            }
        }

        // Compute rightmost positions
        pos = m - 1;
        for (int i = n - 1; i >= 0 && pos >= 0; i--) {
            if (s.charAt(i) == t.charAt(pos)) {
                right[pos] = i;
                pos--;
            }
        }

        // Find maximum gap
        int maxWidth = 0;
        for (int i = 0; i < m - 1; i++) {
            maxWidth = Math.max(maxWidth, right[i + 1] - left[i]);
        }

        System.out.println(maxWidth);
        sc.close();
    }
}