import java.util.*;

public class Main {

    public static int[] d = new int[100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        d[0] = data[0];
        d[1] = Math.max(data[0], data[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + data[i]);
        }

        System.out.println(d[n - 1]);
    }
}
