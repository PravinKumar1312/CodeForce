import java.util.*;

public class DifferentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (sorted.equals(s)) {
                // Check if all characters are the same
                boolean allSame = true;
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) != s.charAt(0)) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    System.out.println("NO");
                } else {
                    // Try to rearrange differently
                    boolean found = false;
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] != arr[0]) {
                            // Swap the different character to the front
                            char temp = arr[0];
                            arr[0] = arr[i];
                            arr[i] = temp;
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("YES");
                        System.out.println(new String(arr));
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                System.out.println("YES");
                System.out.println(sorted);
            }
        }
        sc.close();
    }
}