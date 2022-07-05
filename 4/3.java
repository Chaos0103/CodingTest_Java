import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] data = sc.nextLine().toCharArray();

        int x = data[0] - 'a' + 1;
        int y = data[1] - '1' + 1;

        int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (1 <= nx && nx <= 8 && 1 <= ny && ny <= 8) {
                result++;
            }
        }
        System.out.println(result);
    }
}
