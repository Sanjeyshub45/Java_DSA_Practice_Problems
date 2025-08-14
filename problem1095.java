// 1095. Find in Mountain Array

public class problem1095 {


  public static void main(String[] args)
  {
    int[] arr = {0,1,2,4,2,1};
    int target = 3; 

    System.out.println(ansReturn(arr,target));

  }


  public static int ansReturn(int[] arr,int target){

    int peak = peakElement(arr);

    int firstTry = binarySearch(arr,target,0,peak);

    if(firstTry != -1){
      return firstTry;
    }
    else{

      return binarySearch(arr, target,peak+1,arr.length-1);

    }

  }

  

  public static int binarySearch(int[] arr,int target,int start,int end) {

    boolean isAsc = arr[start]<arr[end] ;

    while(start <= end){

      int mid  = start + (end-start)/2 ;

      if(arr[mid] == target){
        return mid;
      }

      if (isAsc){

        if (arr[mid]<target){
          start = mid+1;
  
        }
        else{
          end = mid-1;
        }

      }
      else {

        if (arr[mid] > target){
          start = mid+1;
        }
        else{
          end = mid-1;
        }

      }
     

    }
    return -1; 
  }

  public static int peakElement(int[] arr) {

    int start = 0;
    int end  = arr.length - 1;

    while(start<end){
      int mid = (start+end)/2;

      if(arr[mid]>arr[mid+1]){
        end = mid;
      }
      else{
        start = mid+1;
      }
    }
    return end;
  }


}
