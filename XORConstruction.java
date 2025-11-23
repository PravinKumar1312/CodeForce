import java.io.*;
import java.util.*;

public class XORConstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // Compute prefix XOR
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] ^ a[i];
        }

        // We need to find b1 such that all b[i] = b1 ^ prefix[i-1] are distinct and in
        // [0, n-1]
        // This means b1 ^ prefix[i] should give all values from 0 to n-1

        // Let's check each bit position to determine b1
        int b1 = 0;

        // For each bit position
        for (int bit = 0; bit < 20; bit++) {
            int mask = 1 << bit;

            // Count how many prefix values have this bit set
            int countPrefix = 0;
            for (int i = 0; i < n; i++) {
                if ((prefix[i] & mask) != 0) {
                    countPrefix++;
                }
            }

            // Count how many numbers from 0 to n-1 have this bit set
            int countTarget = 0;
            for (int i = 0; i < n; i++) {
                if ((i & mask) != 0) {
                    countTarget++;
                }
            }

            // If counts don't match, we need to flip this bit in b1
            if (countPrefix != countTarget) {
                b1 |= mask;
            }
        }

        // Construct the answer
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = b1 ^ prefix[i];
        }

        for (int i = 0; i < n; i++) {
            pw.print(b[i] + " ");
        }
        pw.println();

        pw.close();
    }
}