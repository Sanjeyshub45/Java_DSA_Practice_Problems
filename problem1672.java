public class problem1672 {

  public static void main(String[] args) {

    int[][] accounts = {
      
      {1,2,3},
      {3,2,5}
    
    };

    System.out.println(maximumWealth(accounts));

  }

      public static  int maximumWealth(int[][] accounts) {
  
          int answer = 0;
          for(int customer = 0; customer<accounts.length;customer++){
              int sum = 0;
  
              for(int account = 0; account<accounts[customer].length;account++){
                  sum = sum + accounts[customer][account];
              }
              if(sum > answer){
                  answer = sum;
              }
  
          }
              return answer;
     
      }
  
  
  }

