import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n <= 2) {
                System.out.println(0);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
        sc.close();
    }
}