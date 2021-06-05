package general;
/**
 * For a string, finding the first even length word.
 * ------------------------------------------------
 */

import java.util.*;
import java.lang.*;
import java.io.*;
public class firstEvenLengthWord {

    static int currLen = 0, maxLen = 0;
    static String maxLenWord="";
    static String findEvenStr(String str) {

        List<String> strList = Arrays.asList(str.split(" "));

        strList
                .stream()
                .forEach(evenStr -> {
                    int charLen = evenStr.toCharArray().length;
                    if(charLen%2==0){
                        currLen = charLen;
                        if(maxLen < currLen){
                            maxLen =  currLen;
                            maxLenWord = evenStr;
                        }
                    }
                });

        return maxLenWord;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        String str = "This is test excelsiors string";
        System.out.println(findEvenStr(str));

    }
}
