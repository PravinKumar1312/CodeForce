import java.util.Scanner;

public class BinaryCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int groups = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    groups++;
                }
            }

            boolean hasZeroOne = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                    hasZeroOne = true;
                    break;
                }
            }

            if (hasZeroOne) {
                System.out.println(groups - 1);
            } else {
                System.out.println(groups);
            }
        }
        sc.close();
    }
}