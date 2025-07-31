import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int i = 0;
        for (int j = 0; j <= w; j++) {
            if (k > 0 && w > 0){
                int m = j * k;
                i += m;
            }
        }

        if (i > n) {
            int o = i - n;
            System.out.println(o);
        }
        else {
            System.out.println(0);
        }
        sc.close();
        
    }
}