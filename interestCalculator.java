//calculate interest for amount 10,000 at interest rate of 2-8% using for loop.

public class interestCalculator {
    public static void main(String[] args) {
        for(int i=2;i<=8;i++){
            System.out.println("Interest for 10000 at " + i + "% interest is " + interestCalculator(10000,i));

        }
    }
    public static double interestCalculator(double amount, double interestRate){
        return(amount*(interestRate/100));

    }
}
