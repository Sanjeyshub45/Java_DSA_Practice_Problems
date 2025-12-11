
import java.util.HashMap;

public class problem217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = checkDuplicate(nums);
        System.out.println(ans);
   
    }

    public static boolean checkDuplicate(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;

            }
            map.put(nums[i],i);

            
        }


return false;
    }
    
}
