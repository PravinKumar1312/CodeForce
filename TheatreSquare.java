import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long flagstonesAlongN = (n + a - 1) / a;
        long flagstonesAlongM = (m + a - 1) / a;

        long totalFlagstones = flagstonesAlongN * flagstonesAlongM;

        System.out.println(totalFlagstones);

        sc.close();
    }
}
