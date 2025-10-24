import java.util.Scanner;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            String a = sc.nextLine();
            StringBuilder sb = new StringBuilder(a);
            // Reverse the string
            sb.reverse();
            // Swap 'p' and 'q'
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (c == 'p') {
                    sb.setCharAt(i, 'q');
                } else if (c == 'q') {
                    sb.setCharAt(i, 'p');
                }
                // 'w' remains unchanged
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}