import java.util.*;

public class TeamsForming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] skills = new int[n];

        for (int i = 0; i < n; i++) {
            skills[i] = scanner.nextInt();
        }

        Arrays.sort(skills);

        int totalProblems = 0;

        for (int i = 0; i < n; i += 2) {
            totalProblems += (skills[i + 1] - skills[i]);
        }

        System.out.println(totalProblems);

        scanner.close();
    }
}