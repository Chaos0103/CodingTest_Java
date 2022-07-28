import java.util.*;

public class Main {

    public static int binarySearch(Integer[] lengths, int target, int start, int end) {
        int result= 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int total = isCheck(lengths, mid);
            if (total < target) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

    public static int isCheck(Integer[] lengths, int height) {
        int result = 0;
        for (Integer length : lengths) {
            if (length <= height) {
                break;
            }
            result += length - height;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        Arrays.sort(data, Collections.reverseOrder());

        System.out.println(binarySearch(data, m, 0, data[0]));

    }
}
