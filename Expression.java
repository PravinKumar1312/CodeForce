import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate all possible expressions
        int exp1 = a + b + c;
        int exp2 = a + b * c;
        int exp3 = a * b + c;
        int exp4 = a * b * c;
        int exp5 = (a + b) * c;
        int exp6 = a * (b + c);

        // Find the maximum value
        int maxValue = Math.max(Math.max(Math.max(exp1, exp2), Math.max(exp3, exp4)), Math.max(exp5, exp6));
        System.out.println(maxValue);
        scanner.close();
    }
}