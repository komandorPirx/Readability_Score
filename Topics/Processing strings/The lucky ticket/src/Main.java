import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charNb = str.toCharArray();
        int sumBegin = 0;
        int sumEnd = 0;
        for (int i = 0; i < 3; i++) {
            sumBegin += Character.getNumericValue(charNb[i]);
            sumEnd += Character.getNumericValue(charNb[charNb.length - 1 - i ]);
        }
        if (sumBegin == sumEnd) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
        
    }
}
