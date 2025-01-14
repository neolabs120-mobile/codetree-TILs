import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int swap;

        swap = n;
        n = m;
        m = swap;

        System.out.print(n + " " + m);
    }
}