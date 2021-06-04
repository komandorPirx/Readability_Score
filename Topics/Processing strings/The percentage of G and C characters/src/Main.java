import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine().toLowerCase();
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'c' || str.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println((double) count / len * 100.0);
    }
}
