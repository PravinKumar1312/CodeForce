import java.io.*;
import java.util.*;

public class TheyAreEverywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        Set<Character> allTypes = new HashSet<>();
        for (char c : s.toCharArray()) {
            allTypes.add(c);
        }
        int totalTypes = allTypes.size();

        Map<Character, Integer> windowCount = new HashMap<>();
        int left = 0;
        int minLength = n;

        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);

            while (windowCount.size() == totalTypes) {
                minLength = Math.min(minLength, right - left + 1);

                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (windowCount.get(leftChar) == 0) {
                    windowCount.remove(leftChar);
                }
                left++;
            }
        }

        System.out.println(minLength);
    }
}