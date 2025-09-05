import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int days = 0;
        int socks = n;

        while (socks > 0) {
            days++;
            socks--;
            if (days % m == 0) {
                socks++;
            }
        }

        System.out.println(days);
        scanner.close();
    }
}