public class problrm3232 {
    public static void main(String[] args) {

       int[] nums = {1,2,3,4,5,14};
       if( canAliceWin(nums)){
        System.out.println("True");
       }
       else{
        System.out.println("False");
       }
    }
    public static boolean canAliceWin(int[] nums) {
        int singleSum,doubleSum,totalSum;
        singleSum = doubleSum = totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<10){
                singleSum+= nums[i];
            }
            else{
                doubleSum+=nums[i];
            } 
        }
        totalSum = singleSum + doubleSum;
        if(singleSum > doubleSum ||  doubleSum > singleSum){
            return true;
        }
        return false;
    }
    
}
