import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] data = sc.next().split("");

        int result = 0;
        for (String number : data) {
            int num = Integer.parseInt(number);
            if (num == 0 || num == 1 || result == 0) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}
