import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
        scanner.close();

        String reversedS = new StringBuilder(s).reverse().toString();
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}