import java.io.*;
import java.util.*;

public class MostSociallyDistancedSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] p = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            List<Integer> indices = new ArrayList<>();
            indices.add(0);
            for (int i = 1; i < n - 1; i++) {
                if ((p[i] > p[i - 1] && p[i] > p[i + 1]) || (p[i] < p[i - 1] && p[i] < p[i + 1])) {
                    indices.add(i);
                }
            }
            indices.add(n - 1);
            System.out.println(indices.size());
            for (int i = 0; i < indices.size(); i++) {
                System.out.print(p[indices.get(i)] + " ");
            }
            System.out.println();
        }
    }
}