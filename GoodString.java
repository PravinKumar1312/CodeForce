import java.util.*;

public class GoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int maxLen = 0;

            // Case 1: All characters same
            for (char c = '0'; c <= '9'; c++) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == c) {
                        count++;
                    }
                }
                maxLen = Math.max(maxLen, count);
            }

            // Case 2: Alternating between two digits
            for (char a = '0'; a <= '9'; a++) {
                for (char b = '0'; b <= '9'; b++) {
                    if (a == b)
                        continue;

                    int len = 0;
                    boolean expectA = true;

                    for (int i = 0; i < n; i++) {
                        char current = s.charAt(i);
                        if (expectA) {
                            if (current == a) {
                                len++;
                                expectA = false;
                            }
                        } else {
                            if (current == b) {
                                len++;
                                expectA = true;
                            }
                        }
                    }

                    // For alternating pattern, length must be even
                    if (len % 2 == 1) {
                        len--;
                    }
                    maxLen = Math.max(maxLen, len);
                }
            }

            System.out.println(n - maxLen);

        }
        sc.close();
    }
}