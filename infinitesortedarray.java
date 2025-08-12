public class infinitesortedarray {

  public static void main(String[] args) {

    int[] arr = {12,34,51,57,67,78,98,99};
    int target = 34;
    System.out.println(answer(arr,target));
    
  }
  public static int answer(int[] arr, int target) {

    int start = 0;
    int end = 1;

    while (arr[end] < target){

      int newstart = end + 1;
      end = end + (end - start + 1)*2 ;
      start = newstart;
    }
    return binarySearch(arr,target,start,end);
  }


  public static int binarySearch(int[] arr,int target,int start,int end) {

    while(start<=end){

      int mid  = start + (end-start)/2 ;

      if (arr[mid]<target){
        start = mid+1;

      }
      else if (arr[mid]>target){
        end = mid-1;
      }

      else{
        return mid;
      }

    
    
  }
  return -1;
  
}

}
