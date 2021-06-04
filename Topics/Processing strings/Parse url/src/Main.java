import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int pass = 0;
        String[] text = str.split("[=&?]");
        for (int i = 1; i < text.length; i++) {
            count++;
            if (count == 1) {
                System.out.print(text[i] + " : ");
                if (text[i].equals("pass")) {
                    pass = i;
                }
            } else {
                System.out.print(text[i].length() == 0 ? "not found" : text[i]);
                System.out.println();
                count = 0;
            }
        }
        System.out.println(str.contains("pass=") == true ? "password : " + text[pass + 1] : "");
    }
}
