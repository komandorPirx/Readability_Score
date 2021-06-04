import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bigLetter = sc.nextInt();
        int smallLetter = sc.nextInt();
        Random random = new Random();
        int digit = sc.nextInt();
        int len = sc.nextInt();
        int sum = bigLetter + smallLetter + digit;
          
        String bigPasswd = "";
        String smallPasswd = "";
        String digitPasswd = "";
        String bigPasswdLen = "";
        char ch = (char) ('A' + random.nextInt(26));
        for (int i = 0; i < len; i++) {
            if (bigLetter-- > 0) {
                bigPasswd += Character.toString((char) (ch + i % 3));
            }
            if (smallLetter-- > 0) {
                smallPasswd += Character.toString((char) ('a' + i % 3));
            }
            if (digit-- > 0) {
                digitPasswd += Character.toString((char) ('0' + i % 3));
            }
            if (sum++ < len) {
                bigPasswdLen += Character.toString((char) ('Z' - i % 3));
            }
        }
        System.out.print(bigPasswd + smallPasswd + digitPasswd + bigPasswdLen);

    }
}
