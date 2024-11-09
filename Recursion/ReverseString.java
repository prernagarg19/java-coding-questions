import java.util.Scanner;

class ReverseStr {
    public String reverse(String str) {
        if(str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

public class ReverseString {
    public static void main(String[] args) {
        ReverseStr resStr = new ReverseStr();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(resStr.reverse(str));
    }
}
