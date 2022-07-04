import java.util.*;

public class Main {

    public static boolean isCheck(int h, int m, int s) {
        return h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (isCheck(h, m, s)) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
