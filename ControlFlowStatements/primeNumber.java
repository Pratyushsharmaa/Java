//To check whether a number is prime or not.

public class primeNumber {
    public static void main(String[] args) {
        isPrime(2);
        isPrime(3);
        isPrime(4);
        isPrime(5);
        isPrime(-3);
    }


    public static boolean isPrime(int number){
            if (number <= 1) {
                System.out.println("Invalid");
                return false;
            }
            for(int i=2 ; i<=number/2; i++){   //number/2 because no number will be greater than n/2.
                if(number%i==0){  //we got a number which divides i without remainder other than i
                    System.out.println("False");
                    return false;
                }
            }
        System.out.println("True");
        return true;
    }
}
