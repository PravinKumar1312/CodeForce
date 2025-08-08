import java.util.Scanner;

public class PetayaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Convert both strings to the same case (e.g., lowercase)
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        int result = lowerStr1.compareTo(lowerStr2);

        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}