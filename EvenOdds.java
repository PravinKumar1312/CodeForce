import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long countOdds = (n + 1) / 2;
        if (k <= countOdds) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - countOdds));
        }
        scanner.close();
    }
}