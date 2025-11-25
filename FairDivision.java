import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count1 = 0, count2 = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 1)
                    count1++;
                else
                    count2++;
            }

            int total = count1 + 2 * count2;

            if (total % 2 != 0) {
                System.out.println("NO");
            } else {
                int half = total / 2;
                if (half % 2 == 0 || (half % 2 == 1 && count1 > 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}