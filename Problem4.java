public class Problem4 {

    public static void moveZeroes(int[] nums) {

        int pos =0;
        for(int i=0; i< nums.length;i++){
            if(nums[i] != 0){
                nums[pos++] = nums[i];
            }
        }
        for(; pos < nums.length; pos++){
            nums[pos] =0;
        }

        for(int value: nums)
        {
            System.out.print(value +" ");
        }

       /* int res=0;
        for(int i= 0 ; i<nums.length; i++){
            res= res^nums[i];
        }
        return res;*/
    }

    public static void main(String args[]){

        int ar[]= {0,1,0,3,12};
        moveZeroes(ar);

    }
}
