import java.util.*;

public class YourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String t = scanner.next();

            // Count characters in both strings
            int[] countS = new int[26];
            int[] countT = new int[26];

            for (int j = 0; j < n; j++) {
                countS[s.charAt(j) - 'a']++;
                countT[t.charAt(j) - 'a']++;
            }

            boolean possible = true;
            for (int j = 0; j < 26; j++) {
                if (countS[j] != countT[j]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        scanner.close();
    }
}