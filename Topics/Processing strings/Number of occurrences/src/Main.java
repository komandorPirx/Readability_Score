import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int len = str2.length();
        int indx = 1;
        int count = 0;
        while ((indx = str1.indexOf(str2)) != -1) {
            count++;
            str1 = str1.substring(indx + len);
        }
        System.out.println(count);
    }
}
