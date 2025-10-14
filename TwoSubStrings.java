import java.util.*;

public class TwoSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        if (check(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean check(String s) {
        int ab = s.indexOf("AB");
        int ba = s.indexOf("BA");

        // Check AB followed by BA (non-overlapping)
        if (ab != -1 && s.indexOf("BA", ab + 2) != -1) return true;

        // Check BA followed by AB (non-overlapping)
        if (ba != -1 && s.indexOf("AB", ba + 2) != -1) return true;

        return false;
    }
}