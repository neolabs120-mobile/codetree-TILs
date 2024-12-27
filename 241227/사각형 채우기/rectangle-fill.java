import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[1001];

        array[1] = 1;
        array[2] = 2;

        for(int i = 3; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 10007;
        }

        System.out.println(array[n]);
    }
}