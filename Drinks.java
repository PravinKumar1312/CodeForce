import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of drinks
        int n = scanner.nextInt();

        // Read the percentages
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            sum += p;
        }

        // Calculate the average
        double average = (double) sum / n;

        // Print the result with required precision
        System.out.println(average);
        scanner.close();
    }
}