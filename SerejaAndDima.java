import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int serejaSum = 0;
        int dimaSum = 0;
        boolean serejaTurn = true;

        while (left <= right) {
            int chosen;
            if (cards[left] > cards[right]) {
                chosen = cards[left];
                left++;
            } else {
                chosen = cards[right];
                right--;
            }

            if (serejaTurn) {
                serejaSum += chosen;
            } else {
                dimaSum += chosen;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaSum + " " + dimaSum);

        sc.close();
    }
}