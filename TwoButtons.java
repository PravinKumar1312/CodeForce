import java.util.Scanner;

public class TwoButtons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int steps = 0;

        while (m > n) {
            if (m % 2 == 0) {
                m /= 2;
                steps++;
            } else {
                m++;
                steps++;
            }
        }
        steps += (n - m);

        System.out.println(steps);
        scanner.close();
    }
}