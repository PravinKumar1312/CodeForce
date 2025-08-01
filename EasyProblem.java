import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 1) {
                isHard = true;
            }
        }

        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        sc.close();
    }
}