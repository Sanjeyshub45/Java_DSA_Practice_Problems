public class anagram {


  public static void main(String[] args) {


    String one  = "cat";
    String two  = "catcat";

    System.out.println(isAnagram(one,two));
    
  }
  public static boolean isAnagram(String one,String two) {

    int[] charArr = new int[26];

    for (int ch : one.toCharArray()) {
      charArr[ch-'a'] ++ ;    
    }
    for (int ch : two.toCharArray()) {
      charArr[ch-'a'] -- ;    
    }
    for (int ch : charArr) {
      if(ch!=0){
        return false;
      }    
    }
    return true;
  }
  
}
