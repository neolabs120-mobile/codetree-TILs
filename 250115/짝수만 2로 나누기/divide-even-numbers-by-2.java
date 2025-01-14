import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[101];

        for(int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }

            System.out.print(array[i] + " ");
        }
    }
}