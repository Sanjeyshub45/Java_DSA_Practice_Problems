public class problem724 {
    public static void main(String[] args) {
       int[] nums = {1,7,3,6,5,6};
       int ans = pivotIndex(nums);
       System.out.println(ans);
   
    }
     public static int pivotIndex(int[] nums) {

        int totalSum = 0;
        int rightSum = 0;
        int leftSum = 0;
        for(int num:nums){
            totalSum+=num;
        }

        for (int i = 0; i < nums.length; i++) {

            rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum){
                return i;
            }
            leftSum+=nums[i];
            
        }


return -1;
        
    }
    
}
