import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        int max = 0;
        int indx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                indx = i;
            }
        }
        System.out.println(str[indx]);
    }
}