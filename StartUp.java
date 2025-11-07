import java.util.*;
import java.io.*;

public class StartUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // Group bottles by brand and sum their costs
            Map<Integer, Long> brandSums = new HashMap<>();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int brand = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                brandSums.put(brand, brandSums.getOrDefault(brand, 0L) + cost);
            }

            // Convert to list and sort in descending order
            List<Long> sums = new ArrayList<>(brandSums.values());
            Collections.sort(sums, Collections.reverseOrder());

            // Take top min(n, sums.size()) brands
            int take = Math.min(n, sums.size());
            long total = 0;
            for (int i = 0; i < take; i++) {
                total += sums.get(i);
            }

            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }
}