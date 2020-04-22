public class Problem5 {

    public static int moveZeroes(int[] nums) {

        int res=0;
        for(int i= 0 ; i<nums.length; i++){
            res= res^nums[i];
        }
        return res;
    }

    public static void main(String args[]){

        int ar[]= {7,1,5,3,6,4};
        moveZeroes(ar);

    }

}
