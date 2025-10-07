import java.util.Arrays; 

class cyclicsort{
  public static void main(String[] args) {

    int[] arr = {3,5,2,1,4};

    csort(arr);
    System.out.println(Arrays.toString(arr));
        
  }

  static void csort(int[] arr){

    int i = 0;

    while(i < arr.length){

       int correct = arr[i] - 1;

       if(arr[i]!=arr[correct])
       {
        swap(arr,i,correct);
       }
       else{
        i++ ;
       }

    }
   
  }
  static void swap(int[] arr,int i,int correct){

    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;

  }
}
