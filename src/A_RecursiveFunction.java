package src;
import java.util.*;

public class A_IntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        scanner.close();
        
        ans = func(N);

        System.out.println(ans);
    }

    public static int func(int k) {
        if (k == 0) {
            return 1;
        } else {
            return k *= func(k-1);
        }
    }
}

