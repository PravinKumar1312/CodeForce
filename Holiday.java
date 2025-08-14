import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += max - a[i];
        }
        System.out.println(total);
        scanner.close();
    }
}