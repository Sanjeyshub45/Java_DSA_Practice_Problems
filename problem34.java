// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;
public class problem34 {

  public static void main(String[] args) {

    int[] nums = {5,7,7,8,8,10};
    int target =  8;

    int[] ans  = {-1,-1};

    ans[0] = search(nums, target, true);

    if(ans[0]!= -1)
    {
      ans[1]  = search(nums, target, false);
    }

   System.out.println(Arrays.toString(ans));
  }

  public static int search(int[] nums,int target,boolean signal) {

    int start = 0;
    int end = nums.length-1 ;
    int ans = -1;


    while(start<=end){

      int mid  = (start+end)/2 ;

      if(nums[mid] < target){
        start = mid+1;
      }
      else if(nums[mid] > target){
        end = mid-1;
      }
      else{
        ans  = mid;
        if(signal){
          end = mid-1;
        }
        else{
          start = mid+1;
        }
      }

    }
    return ans;
  }


  // public static int[] showAns(int[] ans) {

  //   return ans;
    
  // }



  
}
