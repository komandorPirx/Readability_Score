import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int n = str.length() / 2 + str.length() % 2 - 1; 
        System.out.println(str.substring(0, n) + str.substring(str.length() - n));
    }
}
