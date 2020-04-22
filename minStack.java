import java.util.Stack;

public class minStack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();


    /*public MinStack() {

    }*/

    public void push(int x) {
        if(stack.empty()){
            stack.push(x);
            minStack.push(x);
        }
        else{
            stack.push(x);
            if(minStack.peek() >x)
            {
                minStack.push(x);
            }
            else
            {
                minStack.push(minStack.peek());
            }
        }

    }

    public void pop() {
        if(stack.empty()){
            System.out.println("stack is empty");
        }
        else {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if(stack.empty()){
            return -1;
        }else{
            return stack.peek();
        }


    }

    public int getMin() {
        if(minStack.empty()){
            return -1;
        }else{
            return minStack.peek();
        }

    }

    public static void main(String args[]){
        minStack minStack = new minStack();
        minStack.push(1);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());  // --> Returns -3.
        minStack.pop();
        System.out.println(minStack.top());     // --> Returns 0.
        System.out.println(minStack.getMin());  // --> Returns -2.


    }
}
