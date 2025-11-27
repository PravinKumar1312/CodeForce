import java.util.*;

public class GameOnTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Build adjacency list
        @SuppressWarnings("unchecked")
        List<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        // BFS to compute depths
        int[] depth = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = true;
        depth[1] = 0;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : tree[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    depth[v] = depth[u] + 1;
                    queue.offer(v);
                }
            }
        }

        // Calculate answer
        double ans = 0.0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / (depth[i] + 1);
        }

        System.out.printf("%.15f\n", ans);
        sc.close();
    }
}