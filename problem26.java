public class problem26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = rmDuplicate(nums);
        System.out.println(ans);
    }
    public static int rmDuplicate(int[] nums) {
        int store = 1;
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]>nums[i-1]){
                nums[store] = nums[i];
                store++;
            }
            
        }
        return store;
    }
    
}
