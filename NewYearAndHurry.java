import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int availableTime = 240 - k;
        int totalTime = 0;
        int problemsSolved = 0;

        for (int i = 1; i <= n; i++) {
            totalTime += 5 * i;
            if (totalTime <= availableTime) {
                problemsSolved++;
            } else {
                break;
            }
        }

        System.out.println(problemsSolved);
        scanner.close();
    }
}