import java.util.Scanner;

public class EatingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }
            
            int i = 0, j = n - 1;
            long leftSum = 0, rightSum = 0;
            int maxCandies = 0;
            
            while (i <= j) {
                if (leftSum < rightSum) {
                    leftSum += w[i];
                    i++;
                } else if (leftSum > rightSum) {
                    rightSum += w[j];
                    j--;
                }
                
                if (leftSum == rightSum) {
                    maxCandies = (i) + (n - 1 - j);
                    // Try to move Alice forward to find more candies
                    leftSum += w[i];
                    i++;
                }
            }
            
            System.out.println(maxCandies);
        }
        sc.close();
    }
}