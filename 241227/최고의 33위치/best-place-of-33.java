import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[21][21];
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > 0; j--) {
                array[i][j] = sc.nextInt();
            }
        }

        //1 5
        //2 5
        //3 5
        //1 4
        //2 4
        //3 4
        //1 3
        //2 3
        //3 3

        /*for(int i = 1; i <= n; i++) {
            for(int j = n; j > 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }*/

        int cnt = 0;
        int max = 0;

        for(int i = 1; i <= n - 2; i++) {
            for(int j = n; j >= 3; j--) {

                if(array[i][j] == 1) cnt++;
                if(array[i+1][j] == 1) cnt++;
                if(array[i+2][j] == 1) cnt++;

                if(array[i][j-1] == 1) cnt++;
                if(array[i][j-2] == 1) cnt++;

                if(array[i+1][j-1] == 1) cnt++;
                if(array[i+1][j-2] == 1) cnt++;

                if(array[i+2][j-1] == 1) cnt++;
                if(array[i+2][j-2] == 1) cnt++;

                if(cnt > max) max = cnt;
                cnt = 0;
            }
        }

        System.out.println(max);
    }
}