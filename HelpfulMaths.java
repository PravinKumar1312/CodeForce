import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Split by '+' to get individual numbers
        String[] numbers = s.split("\\+");

        // Sort the numbers
        Arrays.sort(numbers);

        // Join with '+' and print
        System.out.println(String.join("+", numbers));
        sc.close();
    }
}