import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arrA = new Integer[n];
        Integer[] arrB = new Integer[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (arrA[i] < arrB[i]) {
                int temp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = temp;
            } else {
                break;
            }
        }

        int result = 0;
        for (Integer integer : arrA) {
            result += integer;
        }
        System.out.println(result);
    }
}
