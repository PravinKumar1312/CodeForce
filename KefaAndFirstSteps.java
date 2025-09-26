import java.util.*;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.close();
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] >= arr[i]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println(maxLength);
    }
}
