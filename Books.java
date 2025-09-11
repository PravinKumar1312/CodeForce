import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int left = 0;
        int currentSum = 0;
        int maxBooks = 0;

        for (int right = 0; right < n; right++) {
            currentSum += a[right];
            while (currentSum > t) {
                currentSum -= a[left];
                left++;
            }
            int booksCount = right - left + 1;
            if (booksCount > maxBooks) {
                maxBooks = booksCount;
            }
        }

        System.out.println(maxBooks);
        scanner.close();
    }
}