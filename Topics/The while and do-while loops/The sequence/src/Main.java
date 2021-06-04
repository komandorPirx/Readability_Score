import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = 0;
        int max = Integer.MIN_VALUE;
        while (sc.hasNextInt()) {
            nb = sc.nextInt();
            if (nb % 4 == 0 && nb > max) {
                max = nb;
            }
        }
        System.out.println(max);
    }
}
