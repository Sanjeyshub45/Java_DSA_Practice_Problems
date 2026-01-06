public class problem2413 {
    public static void main(String[] args) {
        int n = 5;
        int ans = checkNum(n);
        System.out.println(ans);
    }
    public static int checkNum(int n){
        return (n%2==0 && n%n==0)? n : n*2;
    }
    
}
