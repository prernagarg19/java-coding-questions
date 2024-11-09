import java.util.Scanner;

/*
 * Given a string find its first uppercase letter
 */

class FirstUpper {
    public char findUppercaseElement(String str) {
        if(str.isEmpty())
            return ' ';
        if(Character.isUpperCase(str.charAt(0)))
            return str.charAt(0);
        else
            return findUppercaseElement(str.substring(1, str.length()));
    }
}

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        FirstUpper upperElem = new FirstUpper();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char ch = upperElem.findUppercaseElement(line);
        System.out.println(ch);
    }   
}