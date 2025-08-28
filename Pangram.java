import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        String s = scanner.nextLine();

        // Convert the string to lowercase to ignore case
        s = s.toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean present : alphabet) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram ? "YES" : "NO");
        scanner.close();
    }
}