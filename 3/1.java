import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 1260;
        int[] coins = {500, 100, 50, 10};
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (n == 0) {
                break;
            }
            if (n >= coins[i]) {
                int count = n / coins[i];
                n %= coins[i];
                result += count;
            }
        }

        System.out.println(result);
    }
}
