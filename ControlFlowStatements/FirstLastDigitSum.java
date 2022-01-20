public class FirstLastDigitSum {
    public static void main(String[] args) {
        sumFirstLastDigit(123);
        sumFirstLastDigit(511);
        sumFirstLastDigit(-1);
        sumFirstLastDigit(8);
    }

    public static int sumFirstLastDigit(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        } else if (number >= 0) {
            int originalNumber = number;
            int firstDigit = 0;
            //to extract last digit
            int lastDigit = number % 10;
            //for a single digit number, no sum required
            if (number < 10) {
                firstDigit=lastDigit;
            }
            //to extract first digit
            else {
            //run while loop until it encounters no digit left
                while (number >= 1) {
            //divide by 10 to drop the least significant digit. eg 125/10 = 12
                    number = number / 10;

                    if (number == 0) {   //will stop when no digit left
                        break;
                    }
                    firstDigit = number; // store first digit

                }
            }
            //print the sum 
            if (originalNumber > 9) {
                System.out.println(firstDigit + lastDigit);
            } else {
                System.out.println(firstDigit);
            }
        }
        return number;
    }
}


