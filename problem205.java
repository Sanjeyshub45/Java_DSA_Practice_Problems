import java.util.HashMap;
public class problem205 {

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
        
    }

    public static  boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char str1 = s.charAt(i);
            char str2 = t.charAt(i);


            if(map1.containsKey(str1) && map1.get(str1)!=str2 || map2.containsKey(str2) && map2.get(str2)!=str1 ){
                return false;
            }

            map1.put(str1,str2);
            map2.put(str2,str1);


            
        }
    return true;
}
}
