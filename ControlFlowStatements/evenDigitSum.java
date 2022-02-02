public class evenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(23421);
    }
    public static int getEvenDigitSum(int number){
        int originalNumber=number;
        //number iterates each value in while loop , so if we dont use originalNumber,
        //at the end output will be like "sum of 0 is" bcoz in the end of while loop number's value is 0

        int lastDigit;
        int sum = 0;

        if(number>=0){

            while (number>0) {
                lastDigit = number % 10; //to extract last digit
                if (lastDigit%2==0) { //to check whether number is even
                    sum += lastDigit;  //adding value to previous lastDigit value
                }
                number /=10;  //drop last digit value
            }
            if(originalNumber>=0) {
                System.out.println("Sum of even numbers within " + originalNumber + " is: ");
            }
            System.out.println(sum);  //print sum of even numbers
                return sum;

        }
        System.out.println("invalid input"); //if the input value is negative
        return -1;
    }
}
