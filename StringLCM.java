import java.util.*;

public class StringLCM {

    static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int lenS = s.length();
            int lenT = t.length();

            // Least common multiple of lengths
            int lcmLen = lcm(lenS, lenT);

            // Extend both strings to the LCM length
            String sRep = repeat(s, lcmLen / lenS);
            String tRep = repeat(t, lcmLen / lenT);

            if (sRep.equals(tRep))
                System.out.println(sRep);
            else
                System.out.println("-1");
        }
        sc.close();
    }

    // Helper function to calculate LCM
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // Greatest common divisor (Euclidean algorithm)
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}