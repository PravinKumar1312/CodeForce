import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] hello = { 'h', 'e', 'l', 'l', 'o' };
        int index = 0;

        for (char c : s.toCharArray()) {
            if (index < hello.length && c == hello[index]) {
                index++;
            }
        }

        System.out.println(index == hello.length ? "YES" : "NO");
        scanner.close();
    }
}