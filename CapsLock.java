import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        if (shouldToggle(word)) {
            // Toggle case for entire word
            StringBuilder result = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(word);
        }
    }

    private static boolean shouldToggle(String word) {
        int n = word.length();

        // Case 1: All letters are uppercase
        boolean allUpper = true;
        for (int i = 0; i < n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                allUpper = false;
                break;
            }
        }
        if (allUpper)
            return true;

        // Case 2: All except the first are uppercase
        boolean firstLowerRestUpper = Character.isLowerCase(word.charAt(0));
        for (int i = 1; i < n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                firstLowerRestUpper = false;
                break;
            }
        }
        return firstLowerRestUpper;
    }
}
