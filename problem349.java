import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class problem349 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] ans =  intersect(arr1,arr2);
      System.out.println(Arrays.toString(ans));
        
    }

    public static int[] intersect(int[] arr1,int[] arr2){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         HashSet<Integer> result = new HashSet<>();

        for(int num:arr2){
            if(map.containsKey( num) && map.get(num)>0){
                result.add(num);
                map.put(num,map.get(num) - 1);
            }
        }
            int[] arr = new int[result.size()];
           int index = 0;
           for(int i:result){
            arr[index++] = i;
    
           }
        
        return arr;

    }
    
}
