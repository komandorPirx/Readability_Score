import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        System.out.print(nb + " ");
        while (nb != 1) {
            if (nb % 2 == 0) {
                nb = nb / 2;
            } else {
                nb = nb * 3 + 1;
            }
            System.out.print(nb + " ");
        }

    }
}
