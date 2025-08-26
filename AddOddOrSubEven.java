import java.util.Scanner;

public class AddOddOrSubEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a == b) {
                System.out.println(0);
            } else if (a < b) {
                long diff = b - a;
                if (diff % 2 == 1) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                long diff = a - b;
                if (diff % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
        scanner.close();
    }
}
