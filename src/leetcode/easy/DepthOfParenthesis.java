package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepthOfParenthesis {
    public static int maxDepth(String s) {
        char[] charArr = s.toCharArray();
        List<Integer> parenDepth = new ArrayList();
        int openParen=0, closeParen = 0;
        for(int i=0; i <charArr.length; i++){
            if(charArr[i] == '('){
                openParen++;
            }

            if(charArr[i] == ')'){
                closeParen++;
            }

            if(closeParen > 0){
                parenDepth.add(openParen);
                openParen = openParen - closeParen;
                closeParen = 0;
            }
        }

        Collections.sort(parenDepth, Collections.reverseOrder());

        if(parenDepth.isEmpty()){
            parenDepth.add(0);
        }

        return parenDepth.get(0);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        String s= "1+(2*3)+(1+((2/4)*6))";

        System.out.println(maxDepth(s));
    }
}
