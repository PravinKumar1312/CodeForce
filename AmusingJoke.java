import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guest = scanner.nextLine();
        String host = scanner.nextLine();
        String pile = scanner.nextLine();

        String combined = guest + host;
        int[] countCombined = new int[26];
        for (char c : combined.toCharArray()) {
            countCombined[c - 'A']++;
        }

        int[] countPile = new int[26];
        for (char c : pile.toCharArray()) {
            countPile[c - 'A']++;
        }

        boolean valid = true;
        for (int i = 0; i < 26; i++) {
            if (countCombined[i] != countPile[i]) {
                valid = false;
                break;
            }
        }

        System.out.println(valid ? "YES" : "NO");
        scanner.close();
    }
}