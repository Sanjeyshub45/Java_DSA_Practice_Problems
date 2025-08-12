public class integerpalindrome {

  public static void main(String[] args) {

    int number = 12231;
    System.out.println(isPalindrome(number));

  }
  public static boolean isPalindrome (int number) {

    int original = number;
    int palin = 0;

    while(original > 0){

     int extract = original%10;
     palin = (palin*10) + extract;
     original /= 10;

    }

 return palin == number;
  
}

}
