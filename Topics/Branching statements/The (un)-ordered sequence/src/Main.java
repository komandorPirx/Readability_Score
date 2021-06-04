import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean directionAsc = true;
        boolean directionDesc = true;
        int current;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            if (current > min) {
                directionAsc = false;
                min = max = current;
            } else if (current < max) {
                directionDesc = false;
                min = max = current;
            } else {
                min = max = current;
            }
        }
        System.out.println(directionAsc || directionDesc);
    }
}
