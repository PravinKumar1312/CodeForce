import java.io.*;

public class Prefiquence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String a = br.readLine();
            String b = br.readLine();

            int i = 0, j = 0;
            while (i < n && j < m) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                }
                j++;
            }
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}