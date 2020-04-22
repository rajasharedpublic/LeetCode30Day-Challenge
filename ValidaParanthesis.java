import javax.swing.text.StyledEditorKit;
import java.util.Stack;

public class ValidaParanthesis {

    public static boolean checkValidString(String s) {
       // Boolean flag = false;
        Stack<Character> stack= new Stack<>();
        Stack<Character> star = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c: ch){
             if(c == '(') {
                stack.push(c);
            }
            else if(c == '*') {
                star.push(c);
            } else {
                 if (!stack.empty()) {
                     stack.pop();
                 } else if (!star.empty()) {
                     star.pop();
                 } else {
                     //flag = false;
                     return false;
                 }
             }
         }

         //Now process leftover opening brackets
         while(!stack.empty()){
            if(star.empty()) {
                    return false;
            }
            else if (stack.peek() <star.peek()){
                stack.pop();
                star.pop();
            }
            else{
               return false;
            }

         }return true;


    }



    public static boolean checkValidString2(String s) {
        Boolean flag = false;

        Stack<Character> stackcheck = new Stack<>();
        Stack<Character> starcheck = new Stack<>();

        char c[] = s.toCharArray();

        for (char i : c) {
            switch (i) {
            case '(':
                    stackcheck.push(i);
                    continue;
                    //break;

            case '*':
                    starcheck.push(i);
                    continue;
                    //break;

            case ')':
                    if (!stackcheck.empty()) {
                        stackcheck.pop();
                    } else if (starcheck.empty()) {
                        starcheck.pop();
                    } else
                        return flag = false;
                    continue;
                    //break;

            default:
                flag = false;
                break;

            }
        }

            while (!stackcheck.empty()) {

                if (starcheck.empty()) {
                    flag = false;
                } else if (stackcheck.pop() < starcheck.pop()) {
                    stackcheck.pop();
                    starcheck.pop();
                } else {
                    flag = false;
                }
            }


            return flag;

    }

    public static void main(String args[]){


        //System.out.println(checkValidString("()"));
       // System.out.println(checkValidString("*(()*))"));

        System.out.println(checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
        //System.out.println(checkValidString("((*)(*))((*"));
       /* System.out.println("(())((())()()(*)(*()(())())())()()((()())((()))(*");
        System.out.println(checkValidString("(*()"));*/
        //System.out.println(checkValidString("(*))"));

    }
}
