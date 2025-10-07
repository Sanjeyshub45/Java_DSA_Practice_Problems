
// 33. Search in Rotated Sorted Array
public class problem33 {
  public static void main(String[] args) {

    int[] arr = {4,5,6,7,0,1,2,3};
    int target = 3;

    System.out.println(rotatedAns(arr,target));

    
  }

  public static int rotatedAns(int[] arr,int target) {

    int pivot = pivotElement(arr);
      // if no pivot, then array not rotated → normal binary search
    if(pivot == -1){
      return binarySearch(arr, target,0,arr.length-1);
    }
    // if pivot element itself is target
    if(arr[pivot] == target){
      return pivot;
    }
      // if target lies in left sorted part
    if(target>=arr[0]){
      return binarySearch(arr, target, 0, pivot-1);

    }
     // else, in right part
  
    return binarySearch(arr, target,pivot+1,arr.length-1);
  }

  public static int pivotElement(int[] arr) {

    int start = 0;
    int end = arr.length-1;

    while(start<=end){

      int mid = (start+end)/2;
       // case 1: mid > mid+1 → mid is pivot

      if(mid<end && arr[mid]>arr[mid+1]){
        return mid;
      }

  // case 2: mid < mid-1 → mid-1 is pivot
      if(mid > start && arr[mid]<arr[mid-1]){
        return mid-1 ;
      }
// case 3: pivot lies in right half
      if(arr[mid]>=arr[start]){
        start = mid+1;
      }
       // case 4: pivot lies in left half
      else{
        end = mid-1;

      }
    }
    return -1;
  }

    public static int binarySearch(int[] searchArray,int target,int start,int end) {

      // int start  = 0;
      // int end = searchArray.length-1;
  
      while(start<=end){
  
        int mid  = start + (end-start)/2 ;
  
        if(searchArray[mid] == target){
          return mid;
        }
        else if (searchArray[mid]<target){
          start = mid+1;
  
        }
        else{
          end = mid-1;
        }
  
      }
      return -1;
    }
    
  }
  

