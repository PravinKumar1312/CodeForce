import java.util.Scanner;

public class VasyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        System.out.println(Math.max(maxBeauty(s, 'a', k), maxBeauty(s, 'b', k)));
        sc.close();
    }

    private static int maxBeauty(String s, char target, int k) {
        int n = s.length();
        int left = 0, right = 0;
        int countOther = 0; // count of characters that are NOT the target
        int maxLen = 0;

        while (right < n) {
            // Expand the window to the right
            if (s.charAt(right) != target) {
                countOther++;
            }

            // Shrink the window from left if we have too many non-target characters
            while (countOther > k) {
                if (s.charAt(left) != target) {
                    countOther--;
                }
                left++;
            }

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}