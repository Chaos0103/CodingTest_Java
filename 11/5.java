import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] balls = new int[n];

        for (int i = 0; i < n; i++) {
            balls[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (balls[i] != balls[j]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
