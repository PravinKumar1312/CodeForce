import java.io.*;
import java.util.*;

public class KalindromeArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if (isKalindrome(arr)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean isKalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                break;
            }
            left++;
            right--;
        }
        if (left >= right) {
            return true;
        }
        int x = arr[left];
        int y = arr[right];
        // Check by removing x
        if (isPalindrome(removeValue(arr, x))) {
            return true;
        }
        // Check by removing y
        if (isPalindrome(removeValue(arr, y))) {
            return true;
        }
        return false;
    }

    private static int[] removeValue(int[] arr, int value) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != value) {
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private static boolean isPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}