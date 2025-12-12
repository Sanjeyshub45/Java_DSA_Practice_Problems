public class anagram{

    public static void main(String[] args) {
        String str1 = "cat";
         String str2 = "aatc";

        boolean ans =  checkAnagram(str1,str2);
        if(ans){
            System.out.println("It is anagram");

        }
        else{
            System.out.println("Not an anagram");
        }


    }
    public static boolean checkAnagram(String str1,String str2){
        int[] store = new  int[26];
        for(char c :str1.toCharArray()){
            store[c-'a']++;
        }
        for(char c :str2.toCharArray()){
            store[c-'a']--;
        }
       for(int count : store){
        if(count!=0){
            return false;
        }

       }
        return true;
    }

}