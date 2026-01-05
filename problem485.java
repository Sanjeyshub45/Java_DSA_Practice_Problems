public class problem485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOccurence = 0;
        int Occurence = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 1){
                Occurence++;
            }
            if(nums[i]!=1){
                maxOccurence = Math.max(maxOccurence,Occurence);
                Occurence = 0;
            }
        
        }
        maxOccurence = Math.max(maxOccurence,Occurence);
        return maxOccurence;


    }
    
}
