import java.util.Arrays;

public class problem283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] ans = move(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] move(int[] nums) {
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int temp = nums[i];
                 nums[i] =  nums[start];
                 nums[start] = temp;
                start++;
            }
 
        }

       
        
        return nums;
    }
    
}
