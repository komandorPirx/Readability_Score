import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int square = 1;
        while (square * square <= nb) {
            System.out.println(square * square);
            square++;
        }
    }
}
