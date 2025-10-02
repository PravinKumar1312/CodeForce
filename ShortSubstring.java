import java.util.Scanner;

public class ShortSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < t; i++) {
            String b = scanner.nextLine();
            StringBuilder a = new StringBuilder();

            // Add first character
            a.append(b.charAt(0));

            // Add every other character starting from index 1
            for (int j = 1; j < b.length() - 1; j += 2) {
                a.append(b.charAt(j));
            }

            // Add last character
            a.append(b.charAt(b.length() - 1));

            System.out.println(a.toString());
        }

        scanner.close();
    }
}