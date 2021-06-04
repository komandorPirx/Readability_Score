import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        for (char i: str.toCharArray()) {
            System.out.printf("%c%c", i, i);
        }
    }
}