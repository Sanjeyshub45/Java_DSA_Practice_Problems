public class stringplaindrome {

  public static void main(String[] args) {
      String str = "pop" ;


      System.out.println(isPalindrome(str));
  }

  public static boolean isPalindrome(String str) {

    int left = 0;
    int right = str.length()-1;

    while(left < right){

      if(str.charAt(right) != str.charAt(left)){

        return false;
      }
  
      left ++;
      right-- ;



    }
  
    
  


    return true;
  }
    


    
  }
  

