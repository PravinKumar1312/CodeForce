import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        if (t == 10) {
            if (n == 1) {
                System.out.println(-1);
            } else {
                System.out.print("1");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print("0");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(t);
            }
            System.out.println();
        }
        sc.close();
    }
}
