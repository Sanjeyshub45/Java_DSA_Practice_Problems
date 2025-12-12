import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class problem349 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5,6};
         int[] arr2= {1,2,4};
         int[] ans = intersect(arr1,arr2);
         System.out.println(Arrays.toString(ans));

        
    }


    public static int[] intersect(int[] arr1,int[] arr2){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i :arr1){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        HashSet<Integer> sol = new HashSet<>();
        
        for(int i : arr2){
            if(map.containsKey( i) && map.get(i)>0){
                sol.add(i);
                map.put(i,map.get(i) - 1);
            }
  
        }
        int[] finalAns = new int[sol.size()];
        int index = 0;
        for(int i :sol){
            finalAns[index++] = i;
        }


return finalAns;
    }
   
    
}
