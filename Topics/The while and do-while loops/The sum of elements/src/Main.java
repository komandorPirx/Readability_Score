import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNb = 0;
        int nb = sc.nextInt();
        while (nb != 0) {
            sumNb += nb;
            nb = sc.nextInt();
        }
        System.out.print(sumNb);
    }
}
