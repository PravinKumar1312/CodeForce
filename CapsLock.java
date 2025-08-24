import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] chars = word.toCharArray();
        boolean allUpper = true;
        boolean exceptFirst = true;

        for (char c : chars) {
            if (!Character.isUpperCase(c)) {
                allUpper = false;
                break;
            }
        }

        if (allUpper) {
            for (int i = 0; i < chars.length; i++) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            System.out.println(new String(chars));
            // return;
        }

        if (Character.isLowerCase(chars[0])) {
            for (int i = 1; i < chars.length; i++) {
                if (!Character.isUpperCase(chars[i])) {
                    exceptFirst = false;
                    break;
                }
            }
        } else {
            exceptFirst = false;
        }

        if (exceptFirst) {
            chars[0] = Character.toUpperCase(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            System.out.println(new String(chars));
        } else {
            System.out.println(word);
        }
        scanner.close();
    }
}