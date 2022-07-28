import java.util.*;

public class Main {

    public static int[] d = new int[10001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i <= m; i++) {
            d[i] = 10001;
        }

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = 1;
            d[num] = 1;
            while (count * num <= m) {
                d[count * num] = Math.min(d[count * num], count);
                count++;
            }
        }
        if (d[m] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[m]);
        }
    }
}
