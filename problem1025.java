public class problem1025 {
    public static void main(String[] args) {
        int n = 9;
        boolean ans = divisorGame(n);
        if(ans){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static boolean divisorGame(int n){

       
        return n%2==0;

    }
    
}
