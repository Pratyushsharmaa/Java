//calculate interest for amount 10,000 at interest rate of 2-8% using for loop.

public class interestCalculator {
    public static void main(String[] args) {
        for(int i=2;i<=8;i++){
            System.out.println("Interest for 10000 at " + i + "% interest is " + String.format("%.2f",interestCalculator(10000,i)));
            //%.2f ensures output is with two decimal places in float.

        }
    }
    public static double interestCalculator(double amount, double interestRate){
        return(amount*(interestRate/100));

    }
}
