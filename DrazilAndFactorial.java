import java.util.*;

public class DrazilAndFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String a = scanner.next();

        List<Integer> digits = new ArrayList<>();

        for (char c : a.toCharArray()) {
            int d = c - '0';
            if (d == 0 || d == 1)
                continue;

            switch (d) {
                case 2:
                    digits.add(2);
                    break;
                case 3:
                    digits.add(3);
                    break;
                case 4:
                    digits.add(3);
                    digits.add(2);
                    digits.add(2);
                    break;
                case 5:
                    digits.add(5);
                    break;
                case 6:
                    digits.add(5);
                    digits.add(3);
                    break;
                case 7:
                    digits.add(7);
                    break;
                case 8:
                    digits.add(7);
                    digits.add(2);
                    digits.add(2);
                    digits.add(2);
                    break;
                case 9:
                    digits.add(7);
                    digits.add(3);
                    digits.add(3);
                    digits.add(2);
                    break;
            }
        }

        // Sort in descending order
        Collections.sort(digits, Collections.reverseOrder());

        // Output the result
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

        scanner.close();
    }
}