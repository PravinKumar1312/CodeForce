import java.util.HashSet;
import java.util.Scanner;

public class GenderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : userName.toCharArray()) {
            distinctChars.add(c);
        }

        int distinctCount = distinctChars.size();
        
        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
