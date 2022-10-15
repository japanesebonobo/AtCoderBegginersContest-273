package src;
import java.util.*;

public class B_EveryoneIsFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double X = scanner.nextDouble();
        int K = scanner.nextInt();;
        scanner.close();
        long ans = 0;

        for (int i = 0; i < K; i++) {
            X = roundFunc(X, i+1);
        }

        ans = (long)X;

        System.out.println(ans);
    }

    public static Long roundFunc(double num, int digits) {
        num /= Math.pow(10, digits);
        num = Math.round(num);
        return (long) (num *= Math.pow(10, digits));
    }
}

