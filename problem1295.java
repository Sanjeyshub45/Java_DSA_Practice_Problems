public class problem1295{

    public static void main(String[] args) {

        int[] nums = {345,2,6,2};
        System.out.println(findNumbers(nums));


    }

    static  int findNumbers(int[] nums) {

        int count  = 0;
        for (int i = 0; i < nums.length; i++) {

            if(evenDigits(nums[i])){
                count = count+1;
            }

        }
        return count;
    }

     static boolean evenDigits(int num){

        return (countDigits(num)%2 == 0);

}

static int countDigits(int num){

    if(num<0){
        num = num *-1;
    }

        int count = 0;
        while (num>0)
        {
            count++;
            num/=10;
    }
        return count;
}





}