import java.io.*;

public class BlackAndWhiteStripe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            String s = br.readLine();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (s.charAt(i) == 'W') ? 1 : 0;
            }

            int whiteCount = 0;
            for (int i = 0; i < k; i++) {
                whiteCount += arr[i];
            }

            int minOps = whiteCount;
            for (int i = k; i < n; i++) {
                whiteCount = whiteCount - arr[i - k] + arr[i];
                if (whiteCount < minOps) {
                    minOps = whiteCount;
                }
            }

            output.append(minOps).append("\n");
        }

        System.out.print(output);
    }
}