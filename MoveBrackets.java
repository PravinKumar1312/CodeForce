import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int balance = 0;
            int moves = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;

                    // If balance becomes negative, we have an extra closing bracket
                    // that needs to be moved
                    if (balance < 0) {
                        moves++;
                        balance = 0; // Reset balance since we'll move this problematic bracket
                    }
                }
            }

            System.out.println(moves);
        }

        scanner.close();
    }
}