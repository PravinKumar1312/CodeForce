import java.io.*;
import java.util.*;

public class HamonOdyssey {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int current = -1;
            int groups = 0;
            for (int num : a) {
                if (current == -1) {
                    current = num;
                } else {
                    current &= num;
                }
                if (current == 0) {
                    groups++;
                    current = -1;
                }
            }
            if (groups == 0) {
                sb.append("1\n");
            } else {
                sb.append(groups).append("\n");
            }
        }
        System.out.print(sb);
    }
}