import java.util.*;

public class Main {

    private static int turnLeft(int distance) {
        distance--;
        if (distance < 0) {
            return 3;
        }
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int distance = sc.nextInt();

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int[][] visited = new int[n][m];
        int result = 1;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int turnTime = 0;
        visited[x][y] = 1;
        while (true) {
            distance = turnLeft(distance);
            int nx = x + dx[distance];
            int ny = y + dy[distance];
            if (map[nx][ny] == 0 && visited[nx][ny] == 0) {
                visited[nx][ny] = 1;
                x = nx;
                y = ny;
                turnTime = 0;
                result++;
                continue;
            } else {
                turnTime++;
            }

            if (turnTime == 4) {
                nx = x - dx[distance];
                ny = y - dy[distance];
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turnTime = 0;
            }
        }
        System.out.println(result);
    }
}
