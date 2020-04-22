/*
Happy Number
Write an algorithm to determine if a number is "happy".
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in
a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
Example:
Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/


public class Problem2 {

    /*public static int happyNumber(int input) {

        if(n==1){
         return 1;
        }else{
        squareSum += (n % 10) * (n % 10);
        return squareSum;
        }
    }*/

    static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    //  method return true if n is Happy number
    static boolean isHappynumber(int n)
    {
        int slow, fast;
        slow = fast = n;
        do
        {
            slow = numSquareSum(slow);

            fast = numSquareSum(numSquareSum(fast));

        }while (slow != fast);

        return (slow == 1);
    }

    public static void main(String args[]){

        int input= 20;
        if (isHappynumber(input))
            System.out.println(input +" is a Happy number");
        else
            System.out.println(input +" is not a Happy number");
        }
}
