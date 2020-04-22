
/*
Traverse the string S.
        If any character except ‘#’ is found push it at back in deque.
        if the character ‘#’ is found pop a character from back of deque.
        Finally pop all elements from front of deque to make new string.

*/

// Java implementation of above approach
import java.util.*;
class Problem9
{

    // Function to find new final String
    static String newString(String S)
    {
        Stack<Character> q = new Stack<Character>();

        for (int i = 0; i < S.length(); ++i)
        {
            if (S.charAt(i) != '#')
                q.push(S.charAt(i));
            else if (!q.isEmpty())
                q.pop();
        }

        // build final string
        String ans = "";

        while (!q.isEmpty())
        {
            ans += q.pop();
        }

        // return final string
        String answer = "";
        for(int j = ans.length() - 1; j >= 0; j--)
        {
            answer += ans.charAt(j);
        }
        return answer;
    }

    static String removeBackSpace(String S){
        Stack<Character> input = new Stack<>();

        int i =0;
        for(i=0; i< S.length(); i++){
            if (S.charAt(i) != '#')
                input.push(S.charAt(i));
            else if (!input.isEmpty())
                input.pop();
        }
        // build final string
        String ans = "";
        while (!input.isEmpty())
        {
            ans += input.pop();
        }
        String return_ans = "";
        for(i=ans.length()-1 ; i>=0 ; i--){
            return_ans += ans.charAt(i);
        }

        return  return_ans;
    }
    public static Boolean compare(String S,String T) {
        if(removeBackSpace(S).equals(removeBackSpace(T))){
            return true;
        }else {
            return false;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "ab#c";  String T = "ad#c";
        System.out.println(compare(S,T));
    }
}
