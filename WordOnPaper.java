import java.util.Scanner;

public class WordOnPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int testCase = 0; testCase < t; testCase++) {
            String[] grid = new String[8];

            // Read the 8x8 grid
            for (int i = 0; i < 8; i++) {
                grid[i] = scanner.nextLine();
            }

            // Find the word
            StringBuilder result = new StringBuilder();

            // Check each column
            for (int col = 0; col < 8; col++) {
                for (int row = 0; row < 8; row++) {
                    char c = grid[row].charAt(col);
                    if (c != '.') {
                        result.append(c);
                    }
                }
                // If we found any letters in this column, we're done
                if (result.length() > 0) {
                    break;
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}