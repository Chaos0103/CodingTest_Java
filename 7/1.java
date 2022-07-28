import java.util.*;

public class Main {

    public static String binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return "yes";
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return "no";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }
        Arrays.sort(items);

        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        for (int target : targets) {
            System.out.print(binarySearch(items, target, 0, n - 1) + " ");
        }
    }
}
