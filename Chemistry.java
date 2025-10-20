import java.util.*;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            // Count frequency of each character
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // Count how many characters have odd frequency
            int oddCount = 0;
            for (int count : freq) {
                if (count % 2 == 1) {
                    oddCount++;
                }
            }

            int remaining = n - k;

            // Check if it's possible
            if (remaining % 2 == 0) {
                // For even length palindrome, we need 0 odd frequencies
                // We need to remove at least 'oddCount' characters to make all frequencies even
                // And the extra removals (k - oddCount) must be even (since we remove in pairs)
                if (oddCount <= k && (k - oddCount) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                // For odd length palindrome, we need exactly 1 odd frequency
                // We need to remove at least 'oddCount - 1' characters
                // And the extra removals (k - (oddCount - 1)) must be even
                if (oddCount - 1 <= k && (k - (oddCount - 1)) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}