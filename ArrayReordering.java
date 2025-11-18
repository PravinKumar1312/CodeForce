import java.util.*;

public class ArrayReordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Separate even and odd numbers
            List<Integer> evens = new ArrayList<>();
            List<Integer> odds = new ArrayList<>();

            for (int num : arr) {
                if (num % 2 == 0) {
                    evens.add(num);
                } else {
                    odds.add(num);
                }
            }

            // Build the rearranged array: evens first, then odds
            List<Integer> rearranged = new ArrayList<>();
            rearranged.addAll(evens);
            rearranged.addAll(odds);

            // Count good pairs
            int count = 0;

            // Count pairs where first element is even
            // Each even can pair with all elements after it
            int evenCount = evens.size();
            for (int i = 0; i < evenCount; i++) {
                count += (n - i - 1);
            }

            // Count pairs where both are odd and gcd(odd1, odd2) > 1
            int oddCount = odds.size();
            for (int i = 0; i < oddCount; i++) {
                for (int j = i + 1; j < oddCount; j++) {
                    int a = rearranged.get(evenCount + i);
                    int b = rearranged.get(evenCount + j);
                    if (gcd(a, b) > 1) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}