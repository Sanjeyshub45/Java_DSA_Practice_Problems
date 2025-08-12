public class binarysearch {

  public static void main(String[] args) {

    int[] searchArray = {2,12,24,56,98,101};
    int target = 101;
    
    if(binarySearch(searchArray,target)){
      System.out.println("the element is found");
    }
    else{
      System.out.println("the element is not found");
    }
    
  }

  public static boolean binarySearch(int[] searchArray,int target) {

    int start  = 0;
    int end = searchArray.length-1;

    while(start<=end){

      int mid  = start + (end-start)/2 ;

      if(searchArray[mid] == target){
        return true;
      }
      else if (searchArray[mid]<target){
        start = mid+1;

      }
      else{
        end = mid-1;
      }

    }
    return false;
  }
  
}
