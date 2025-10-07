import java.util.Arrays;
class selection{
  public static void main(String args[]){

    int arr[] = {6,5,4,3,2,1};
    Selectionsort(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void Selectionsort(int[] arr){

    for(int i =0;i<arr.length;i++){

       int min = i;

      for(int j =i+1;j<arr.length;j++){
       
        if(arr[j]<arr[min]){
          min = j;
        }

      }
       swap(arr,i,min);
    }

  }

  static void  swap(int[] arr,int first,int last){
    int temp = arr[last];
    arr[last] = arr[first];
    arr[first] = temp;
  }
}