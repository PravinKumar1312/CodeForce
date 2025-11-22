import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] canPass = new boolean[n + 1];

        // Read Little X's levels
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            canPass[level] = true;
        }

        // Read Little Y's levels
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            canPass[level] = true;
        }

        // Check if all levels from 1 to n are covered
        boolean allPassed = true;
        for (int i = 1; i <= n; i++) {
            if (!canPass[i]) {
                allPassed = false;
                break;
            }
        }

        if (allPassed) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}