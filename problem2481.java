public class problem2481 {
    public static void main(String[] args) {
        int n = 1;
        int ans = numberOfCuts(n);
        System.out.println(ans);
        
    }
     public static int numberOfCuts(int n) {

        if(n==1){
            return 0;
        }
        return (n%2==0) ? n/2 : n ;


       
        
    }
    
}
