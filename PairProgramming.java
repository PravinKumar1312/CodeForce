import java.util.*;

public class PairProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }

            int i = 0, j = 0;
            int currentLines = k;
            List<Integer> result = new ArrayList<>();
            boolean possible = true;

            while (i < n || j < m) {
                if (i < n && a[i] == 0) {
                    result.add(0);
                    currentLines++;
                    i++;
                } else if (j < m && b[j] == 0) {
                    result.add(0);
                    currentLines++;
                    j++;
                } else if (i < n && a[i] <= currentLines) {
                    result.add(a[i]);
                    i++;
                } else if (j < m && b[j] <= currentLines) {
                    result.add(b[j]);
                    j++;
                } else {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
            } else {
                for (int num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}