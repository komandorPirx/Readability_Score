import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ordered = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) + 1 != str.charAt(i + 1)) {
                ordered = false;
            }
        }
        System.out.println(ordered);
    }
}
