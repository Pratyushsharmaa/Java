//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//eg 6 = 1+2+3 ; 28=1+2+4+7+14

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);

    }
    public static boolean isPerfectNumber(int number){
        int perfect = 0;
        if(number>=1){
           for(int i=1;i<number;i++){
               if(number%i==0){
                   perfect += i;
               }
           }
        return perfect==number;
        }
        return false;
    }

    }

