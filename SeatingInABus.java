import java.util.*;
import java.io.*;

public class SeatingInABus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Set<Integer> occupied = new HashSet<>();
            occupied.add(a[0]);
            boolean valid = true;
            for (int i = 1; i < n; i++) {
                int seat = a[i];
                if (occupied.contains(seat - 1) || occupied.contains(seat + 1)) {
                    occupied.add(seat);
                } else {
                    valid = false;
                    break;
                }
            }
            sb.append(valid ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}