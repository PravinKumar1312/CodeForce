import java.util.*;
import java.io.*;

public class KefaAndCompany {
    static class Friend {
        long money;
        long factor;

        Friend(long money, long factor) {
            this.money = money;
            this.factor = factor;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        Friend[] friends = new Friend[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long money = Long.parseLong(st.nextToken());
            long factor = Long.parseLong(st.nextToken());
            friends[i] = new Friend(money, factor);
        }

        // Sort friends by money
        Arrays.sort(friends, (a, b) -> Long.compare(a.money, b.money));

        long maxFriendship = 0;
        long currentSum = 0;
        int left = 0;

        // Sliding window
        for (int right = 0; right < n; right++) {
            currentSum += friends[right].factor;

            // Shrink window until it's valid
            while (friends[right].money - friends[left].money >= d) {
                currentSum -= friends[left].factor;
                left++;
            }

            maxFriendship = Math.max(maxFriendship, currentSum);
        }

        System.out.println(maxFriendship);
    }
}