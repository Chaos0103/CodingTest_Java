import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] d = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                d[i] = Math.min(d[i - 1], d[i / 2]);
            } else if (i % 3 == 0) {
                d[i] = Math.min(d[i - 1], d[i / 3]);
            } else if (i % 5 == 0) {
                d[i] = Math.min(d[i - 1], d[i / 5]);
            } else {
                d[i] = d[i - 1];
            }
            d[i]++;
        }

        System.out.println(d[n]);
    }
}
