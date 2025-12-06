public class binaryRecursion {

public static void main(String[] args) {

    int[] arr = {2,5,7,45,77,98};
    int target = 5;
    int s = 0;
    int e = arr.length-1;
   int  ans = binarySearch(arr,target,s,e);
   System.out.println(ans);
 
}

public static int binarySearch(int[] arr,int target,int s,int e){

    if(s>e){
        return -1;
    }

    int m = s+ (e-s)/2 ;

    if(arr[m] == target){
        return m;
    }

    if (arr[m]>target){

         return binarySearch(arr,target,s,m-1);

    }
          return binarySearch(arr,target,m+1,e);

}
    
}
