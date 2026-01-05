public class problem2119 {
    public static void main(String[] args) {
        int num = 1800;
        boolean ans = isSameAfterReversals(num);
        if(ans){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }

     public static boolean isSameAfterReversals(int num) {
        return num==0 || num%10!=0;    
    }
    
}
