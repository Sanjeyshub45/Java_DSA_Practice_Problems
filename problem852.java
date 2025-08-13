public class problem852 {

  public static void main(String[] args) {

    int[] arr = {1,2,3,4,7,19,5,3,2,1};
    System.out.println(peakIndex(arr));
    
  }

  public static int peakIndex(int[] arr) {

    int start = 0;
    int end = arr.length - 1;

    while(start<end){
      int mid = (start+end)/2;

      if(arr[mid]>arr[mid+1]){ 
        end = mid;
         //descending part

      }
      else{
        start = mid+1;
      }
    }

    return start;
  }
  
}
