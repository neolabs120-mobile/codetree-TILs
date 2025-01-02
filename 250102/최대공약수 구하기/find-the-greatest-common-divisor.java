import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;

        if(n >= m) {
            for(int i = 1; i <= m; i++) {
                if(n % i == 0 && m % i == 0) {
                    max = i;
                }
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(n % i == 0 && m % i == 0) {
                    max = i;
                }
            }
        }

        System.out.println(max);
    }
}