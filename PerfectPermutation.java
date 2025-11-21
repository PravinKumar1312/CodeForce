import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            // Build the permutation: 2 1 4 3 ... n n-1
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print((i - 1) + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}