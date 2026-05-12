import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            if (grid[r][c] == 0 && !visited[r][c]) {
                visited[r][c] = true;
                queue.add(new int[]{r, c});
            }
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            answer++;

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }

                if (grid[nx][ny] == 1) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }

        System.out.println(answer);
    }
}