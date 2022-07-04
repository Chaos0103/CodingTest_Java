import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        //오름차순
        Arrays.sort(data);
        
        int cnt = m / k;
        int result = data[n - 2] * cnt;
        result += data[n - 1] * (m - cnt);
        System.out.println(result);
    }
}
