import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 1,4
        // 2,4
        // 3,4
        // 4,4
        // 1,3
        // 2,3
        // 3,3
        // 4,3

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[101][101];
        int number = 1;

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n; j++) {
                array[j][i] = number;
                number++;
                if(number == 10) number = 1;
            }
        }

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println("");
        }
    }
}