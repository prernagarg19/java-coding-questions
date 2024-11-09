
/*
 * Implement a function that capitalizes each first word in String.
 */

import java.util.Scanner;

class GetCapializedString {
    public String getCapitalizedWords(String str) {
        // Implement a function that capitalizes each word in String.
        // if(str.isEmpty())
        //     return str;
        // return Character.toUpperCase(str.charAt(0)) + getCapitalizedWords(str.substring(1, str.length()));

        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return getCapitalizedWords(str.substring(0,str.length()-1))+ Character.toString(chr);
         
    }
}

public class CapitalizeWords {
    public static void main(String[] args) {
        GetCapializedString getCaps = new GetCapializedString();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getCaps.getCapitalizedWords(s));
    }    
}
