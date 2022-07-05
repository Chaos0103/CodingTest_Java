import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] data = new Integer[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        Arrays.sort(data, Collections.reverseOrder());

        for (Integer num : data) {
            System.out.print(num + " ");
        }
    }
}
