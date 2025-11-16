import java.util.*;
import java.io.*;

public class Journey {
    static ArrayList<Integer>[] graph;
    static double expectedLength = 0;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(1, -1, 0, 1.0);
        System.out.printf("%.15f\n", expectedLength);
    }

    static void dfs(int node, int parent, double depth, double probability) {
        int childrenCount = 0;

        // Count unvisited children (neighbors excluding parent)
        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                childrenCount++;
            }
        }

        // If no children, add to expected length
        if (childrenCount == 0) {
            expectedLength += depth * probability;
            return;
        }

        // Visit each child with equal probability
        double childProbability = probability / childrenCount;

        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, depth + 1, childProbability);
            }
        }
    }
}