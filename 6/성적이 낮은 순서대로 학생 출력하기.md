import java.util.*;

class Information implements Comparable<Information> {

    private String name;
    private int score;

    public Information(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Information other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Information> info = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(" ");
            info.add(new Information(data[0], Integer.parseInt(data[1])));
        }

        Collections.sort(info);

        for (Information information : info) {
            System.out.print(information.getName() + " ");
        }
    }
}
