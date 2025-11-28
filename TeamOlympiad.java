import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> threes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int skill = sc.nextInt();
            if (skill == 1)
                ones.add(i);
            else if (skill == 2)
                twos.add(i);
            else
                threes.add(i);
        }

        int teams = Math.min(ones.size(), Math.min(twos.size(), threes.size()));
        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(ones.get(i) + " " + twos.get(i) + " " + threes.get(i));
        }

        sc.close();
    }
}