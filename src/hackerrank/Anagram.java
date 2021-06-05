package hackerrank;

import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0;i < a.length();i++)
        {
            char wordArrA = a.charAt(i);
            int index = b.indexOf(wordArrA);

            if(index != -1){
                b = b.substring(0, index) +b.substring(index+1, b.length());
            }else{
                return false;
            }
        }
        return b.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
