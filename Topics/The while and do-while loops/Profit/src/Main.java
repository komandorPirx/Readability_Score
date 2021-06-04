import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();
        int count = 0;
        while (m < k) {
            m += m * p * 0.01;
            count++;
        }
        System.out.print(count);

    }
}
