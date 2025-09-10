import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            int m = scanner.nextInt();
            long left = x;
            long right = x;
            for (int i = 0; i < m; i++) {
                long l = scanner.nextLong();
                long r = scanner.nextLong();
                if (l <= right && r >= left) {
                    left = Math.min(left, l);
                    right = Math.max(right, r);
                }
            }
            System.out.println(right - left + 1);
        }

        scanner.close();
    }
}