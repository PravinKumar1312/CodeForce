import java.util.Scanner;

public class Shovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();

        int shovels = 1;
        while (true) {
            int total = k * shovels;
            if (total % 10 == r || total % 10 == 0) {
                break;
            }
            shovels++;
        }
        System.out.println(shovels);
        scanner.close();
    }
}