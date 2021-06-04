import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] strArr = str.split("-");
        
        System.out.println(strArr[1] + "/" + strArr[2] + "/" + strArr[0]);
        
        
    }
}
