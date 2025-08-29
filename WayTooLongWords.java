import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int len = word.length();
            if (len > 10) {
                // Abbreviate: first char + (len-2) + last char
                String abbreviated = word.charAt(0) + String.valueOf(len - 2) + word.charAt(len - 1);
                System.out.println(abbreviated);
            } else {
                System.out.println(word);
            }
        }
        scanner.close();
    }
}