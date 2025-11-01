import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean valid = true;
            boolean foundLetter = false;

            for (int i = 0; i < n - 1; i++) {
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);

                // Check if digit comes after letter
                if (Character.isLetter(curr)) {
                    foundLetter = true;
                }
                if (foundLetter && Character.isDigit(next)) {
                    valid = false;
                    break;
                }

                // Check if not sorted
                if (curr > next) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }
        sc.close();
    }
}