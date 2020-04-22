/*Algorithm: segregateEvenOdd()
        1) Initialize two index variables left and right:
        left = 0,  right = size -1
        2) Keep incrementing left index until we see an odd number.
        3) Keep decrementing right index until we see an even number.
        4) If lef < right then swap arr[left] and arr[right]
*/

public class SegregateOddEven {
    static void segregateEvenOdd(int arr[]) {

        int left =0; int right = arr.length-1; int temp;
      /*  for(i=0; i<arr.length-1; i++, j--){
            if(arr[i]/2 ==0)
                i++;
            if(arr[j]/2==1)
                j--;

        }*/
        while(left<right){

            while(arr[left]%2==0 && left<right){
                left++;
            }

            while(arr[right]%2==1 && left < right){
                right--;
            }

            if(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
      }
      //return arr;
    }

    static void main(int a , int b){
        int temp =a;
        a=b;
        b=temp;
    }

        public static void main (String[] args)
    {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};

        System.out.print("Before after segregation ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        segregateEvenOdd(arr);

        System.out.print("Array after segregation ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
