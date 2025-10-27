import java.util.Arrays;
public class problem645 {

    public static void main(String[] args) {
        int nums[] = {1,1};
       
        System.out.println(Arrays.toString( findMistmatch(nums)));
        
        
    }
    static int[] findMistmatch(int[] nums){
        int i = 0;

        while(i<nums.length){
            int correct = nums[i] - 1;

            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
           
        }
        for (int index = 0; index < nums.length; index++) {

            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }

            
        }
        return new int[] {-1,-1};
    }

    static void swap(int nums[],int from,int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }



    
}
