package Nodarbiba16clases;

import java.util.Arrays;
import java.util.Locale;

public class StringUtils {
    public static String getMiddle(String text) {
        int x = text.length() / 2;
        int y = x + 1;
        if (text.length() % 2 == 1) {
            return text.substring(x, y);
        }
        return text.substring(x - 1, y);
    }

    public static String getReverse(String text) {
        String nstr = "";
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            nstr = ch + nstr;


        }
        return nstr;
    }

    public static boolean isPalindrome(String text) {

       return(text.equalsIgnoreCase(getReverse(text)));
            //return true;
        }
        /*char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            newText = ch + newText;
            if (newText.equalsIgnoreCase(text)) {
                return true;*/




      //  return false;


}


