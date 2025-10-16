import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            // Swap first characters
            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);

            System.out.println(newA + " " + newB);
        }
        sc.close();
    }
}