import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            if ((n & (n - 1)) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
