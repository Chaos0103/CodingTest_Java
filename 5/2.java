import java.util.*;

public class Main {

    private static int[][] data = new int[200][200];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                data[i][j] = chars[j] - '0';
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Pos> q = new LinkedList<Pos>();
        q.offer(new Pos(0, 0));
        while (!q.isEmpty()) {
            Pos pos = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (data[nx][ny] == 1){
                    data[nx][ny] = data[pos.x][pos.y] + 1;
                    q.offer(new Pos(nx, ny));
                }
            }
        }

        System.out.println(data[n - 1][m - 1]);

    }
}

class Pos {
    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
