import java.util.Scanner;

public class TwoIntegerPbrlm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long diff = Math.abs(a - b);
            long moves = (diff + 9) / 10;
            System.out.println(moves);
        }
        scanner.close();
    }
}