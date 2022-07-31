import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        int result = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (count >= data[i]) {
                result++;
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println(result);
    }
}
