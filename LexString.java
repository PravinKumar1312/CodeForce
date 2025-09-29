import java.util.*;

public class LexString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();

            // Sort both arrays to get smallest characters first
            Arrays.sort(a);
            Arrays.sort(b);

            StringBuilder c = new StringBuilder();
            int i = 0, j = 0;
            int consecA = 0, consecB = 0;

            while (i < n && j < m) {
                // Check if we can take from string a
                boolean canTakeFromA = consecA < k;
                // Check if we can take from string b
                boolean canTakeFromB = consecB < k;

                if (canTakeFromA && (!canTakeFromB || a[i] < b[j])) {
                    // Take from a if it's smaller or we can't take from b
                    c.append(a[i]);
                    i++;
                    consecA++;
                    consecB = 0; // Reset consecutive count for b
                } else {
                    // Take from b
                    c.append(b[j]);
                    j++;
                    consecB++;
                    consecA = 0; // Reset consecutive count for a
                }
            }

            System.out.println(c.toString());
        }
        sc.close();
    }
}