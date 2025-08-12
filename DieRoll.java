import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();

        int max = Math.max(Y, W);
        int favorable = 6 - max + 1;

        int gcd = findGCD(favorable, 6);
        String numerator = String.valueOf(favorable / gcd);
        String denominator = String.valueOf(6 / gcd);

        System.out.println(numerator + "/" + denominator);
        scanner.close();
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}