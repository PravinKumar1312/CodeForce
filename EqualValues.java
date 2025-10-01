import java.io.*;
import java.util.*;

public class EqualValues {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Map<Integer, List<Integer>> indices = new HashMap<>();
            for (int i = 0; i < n; i++) {
                indices.computeIfAbsent(a[i], k -> new ArrayList<>()).add(i);
            }

            long minCost = Long.MAX_VALUE;

            for (int value : indices.keySet()) {
                List<Integer> pos = indices.get(value);
                long cost = 0;

                if (pos.get(0) > 0) {
                    cost += (long) pos.get(0) * value;
                }

                if (pos.get(pos.size() - 1) < n - 1) {
                    cost += (long) (n - 1 - pos.get(pos.size() - 1)) * value;
                }

                for (int i = 1; i < pos.size(); i++) {
                    int gap = pos.get(i) - pos.get(i - 1) - 1;
                    if (gap > 0) {

                        long option1 = (long) gap * value;
                        long option2 = (long) gap * value;
                        cost += Math.min(option1, option2);
                    }
                }

                minCost = Math.min(minCost, cost);
            }

            System.out.println(minCost);
        }
    }
}