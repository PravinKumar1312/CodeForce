import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] digits = new int[n];

            for (int i = 0; i < n; i++) {
                digits[i] = sc.nextInt();
            }

            long maxProduct = 0;

            // Try adding 1 to each digit and calculate the product
            for (int i = 0; i < n; i++) {
                // Create a temporary array for this iteration
                long product = 1;

                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        product *= (digits[j] + 1); // Add 1 to current digit
                    } else {
                        product *= digits[j];
                    }
                }

                maxProduct = Math.max(maxProduct, product);
            }

            System.out.println(maxProduct);
        }

        sc.close();
    }
}