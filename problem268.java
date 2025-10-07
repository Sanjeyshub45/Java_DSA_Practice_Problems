// Missing Number

public class problem268 {
  public int missingNumber(int[] arr) {

     int i = 0;

    while(i < arr.length){

       int correct = arr[i];

       if(arr[i]<arr.length   && arr[i]!=arr[correct])
       {
        swap(arr,i,correct);
       }
       else{
        i++ ;
       }

    }
    for (int j = 0; j < arr.length; j++) {

      if(arr[j] != j){
        return j;
      }
      
      
    }
    return arr.length;
   
  }
  static void swap(int[] arr,int i,int correct){

    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;

  }


  }


