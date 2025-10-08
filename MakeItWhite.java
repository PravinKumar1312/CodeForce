import java.util.Scanner;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int firstBlack = -1;
            int lastBlack = -1;

            // Find first and last occurrence of 'B'
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    if (firstBlack == -1) {
                        firstBlack = i;
                    }
                    lastBlack = i;
                }
            }

            // Calculate the length of segment needed
            int result = lastBlack - firstBlack + 1;
            System.out.println(result);
        }

        scanner.close();
    }
}