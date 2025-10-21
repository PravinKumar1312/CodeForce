import java.util.*;
import java.io.*;

public class SortTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(arr, n);
    }

    private static void solve(int[] arr, int n) {
        // Find the decreasing segment
        int start = -1, end = -1;

        // Find start of decreasing segment
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If no decreasing segment found, array is sorted
        if (start == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        // Find end of decreasing segment
        end = start;
        while (end < n - 1 && arr[end] > arr[end + 1]) {
            end++;
        }

        // Reverse the segment
        reverse(arr, start, end);

        // Check if entire array is sorted
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
        System.out.println((start + 1) + " " + (end + 1));
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}