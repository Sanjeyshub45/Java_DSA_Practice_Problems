public class problem1752 {
    public static void main(String[] args) {
       int[] nums = { 6,7,6};
       boolean ans = check(nums);

       if(ans){
        System.out.println("True");
       }
       else{
        System.out.println("False");
       }
    
    }

     public static  boolean check(int[] nums) {

        int violation = 0;
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]>nums[i+1]){
                violation++;
            }
            
        }
        if(violation==1){

            if(nums[0]>=nums[nums.length-1]){
                return true;
            }

        }

        // if (violation==0){
        
        //     return true;
        // }

      return false;

     }
    

}
