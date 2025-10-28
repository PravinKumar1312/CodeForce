import java.util.*;

public class Increasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            boolean hasDuplicate = false;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (set.contains(num)) {
                    hasDuplicate = true;
                }
                set.add(num);
            }

            if (hasDuplicate) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        scanner.close();
    }
}