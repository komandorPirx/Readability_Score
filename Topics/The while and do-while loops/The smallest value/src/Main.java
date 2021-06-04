import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nb = scanner.nextLong();
        long wanted = 1;
        int count = 0;
        while (nb >= wanted) {
            wanted  = ++count * wanted;
        }
        System.out.println(count);
    }

}
