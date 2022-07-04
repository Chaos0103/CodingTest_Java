import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] direction = {"L", "R", "U", "D"};

        int x = 1, y = 1;

        for (String plan : plans) {
            int nx = x;
            int ny = y;
            for (int j = 0; j < 4; j++) {
                if (direction[j].equals(plan)) {
                    nx += dx[j];
                    ny += dy[j];
                    break;
                }
            }
            if (0 < nx && nx <= n && 0 < ny && ny <= n) {
                x = nx;
                y = ny;
            }
        }

        System.out.println(x + " " + y);
    }
}
