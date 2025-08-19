import java.util.*;

public class LuckyDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Generate all lucky numbers up to n
        List<Integer> luckyNumbers = new ArrayList<>();
        generateLuckyNumbers(n, luckyNumbers);

        // Check if n is divisible by any lucky number
        boolean almostLucky = false;
        for (int num : luckyNumbers) {
            if (n % num == 0) {
                almostLucky = true;
                break;
            }
        }

        System.out.println(almostLucky ? "YES" : "NO");
        scanner.close();
    }

    private static void generateLuckyNumbers(int max, List<Integer> list) {
        // Start with numbers 4 and 7
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(7);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current > max) {
                continue;
            }
            list.add(current);
            // Generate next numbers by appending 4 and 7
            queue.add(current * 10 + 4);
            queue.add(current * 10 + 7);
        }
    }
}