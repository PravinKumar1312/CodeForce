import java.util.Scanner;

public class MinBeforeNY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int totalMinutes = h * 60 + m;
            int minBeforeNY = 1440 - totalMinutes;
            System.out.println(minBeforeNY);
        }
        sc.close();
    }
}
