import java.io.*;

public class ABFlipping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int result = 0;
            // Count number of 'B's from the right
            int countB = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'B') {
                    countB++;
                } else if (s.charAt(i) == 'A') {
                    // This 'A' can perform operations with all 'B's to its right
                    result += countB;
                    if (countB > 0) {
                        // After operation, this 'A' becomes 'B' and the 'B' becomes 'A'
                        // So we effectively transfer one 'B' to the left
                        countB = 1;
                    }
                }
            }

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}