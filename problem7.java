public class problem7 {
    public static void main(String[] args) {
        int  x = -123;
        int ans = reverse(x);
   
    }
     public static int reverse(int x) {
        boolean signOfNum = true;
        if(x<0){
            signOfNum = false;
        }

        x = Math.abs(x);
        long revAns = 0;

        while(x>0){
            revAns = (revAns*10)+(x%10);
            x/=10;

            if(revAns>Integer.MAX_VALUE){
                return 0;
            }

        }
        if(!signOfNum){
            return -1* (int)revAns;
        }
        else{
            return (int)revAns ;
        }


    }
    
}
