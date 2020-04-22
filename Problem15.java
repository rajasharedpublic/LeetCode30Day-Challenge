import java.util.Arrays;

public class Problem15 {

    public static int[] productExceptSelf2(int[] nums) {
        int[] prod = new int[nums.length];
        Arrays.fill(prod, 1);
        int leftProd = 1; int rightProd = 1;
        for(int i = 1; i < nums.length; i++) {
            leftProd *= nums[i-1];
            prod[i] *= leftProd;
        }
        for(int i = nums.length-2; i>=0; i--) {
            rightProd = nums[i+1] * rightProd;
            prod[i]*=rightProd;
        }
        return prod;
    }
    public static int[] productExceptSelf(int[] nums){

        int[] output= new int[nums.length];

        output[0]= 1;
        for(int i=1; i<nums.length; i++){
            output[i] = nums[i-1]*output[i-1];
        }

        /*for(int i:nums){
            output[i] = nums[i-1]*output[i-1];
        }*/
        int product =1;
        for(int i = nums.length-1; i>=0; i--){

            output[i] = output[i]*product;
            product = product*nums[i];
        }
        return output;

    }
    public static void main(String args[]){

        int ar[]= {1, 2, 3,4};
        System.out.println(productExceptSelf2(ar));
    }

}
