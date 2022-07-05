import java.util.*;

public class Main {

    public static int n, m;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();


    public static boolean dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (graph.get(x).get(y) == 0) {
            graph.get(x).set(y, 1);
            dfs(x + 1, y);
            dfs(x - 1, y);
            dfs(x, y + 1);
            dfs(x, y - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (char ch : chars) {
                graph.get(i).add(ch == '0' ? 0 : 1);
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph.get(i).get(j) == 0) {
                    if (dfs(i, j)) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
