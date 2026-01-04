import java.util.Arrays;

public class problem238 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
        
    }
     public static  int[] productExceptSelf(int[] nums) {

        int[] leftPrefix = new int[nums.length];
         int[] rightPrefix = new int[nums.length];
         leftPrefix[0] = 1;
         rightPrefix[nums.length-1] = 1;

         for (int i = 1; i < nums.length; i++) {
            leftPrefix[i] = leftPrefix[i-1]*nums[i-1];
   
         }

         for (int i = nums.length-2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i+1]*nums[i+1];
         }
         for (int i = 0; i < nums.length; i++) {
            if(i==0){
                nums[i] = rightPrefix[i];
            }
            else if(i == nums.length-1){
                nums[i] = leftPrefix[i];
            }
            else{
                nums[i] = rightPrefix[i]*leftPrefix[i];
            }
            
         }
         return nums;
     }
}
