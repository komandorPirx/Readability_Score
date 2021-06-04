import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        int max = Integer.MIN_VALUE;
        while ((nb = scanner.nextInt()) != 0) {
            if (max < nb) {
                max = nb;
            }
        }
        System.out.println(max);
    }
}