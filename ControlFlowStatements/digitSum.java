//print sum of digits.

//Read or initialize an integer N.
//        Declare a variable (sum) to store the sum of numbers and initialize it to 0.
//       Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
//        Add the last digit to the variable sum.
 //       Divide the number (N) by 10. It removes the last digit of the number.
  //      Repeat the above steps (3 to 5) until the number (N) becomes 0.


public class digitSum {
    public static void main(String[] args) {
        sumDigits(125);
    }
    public static int sumDigits(int number){
        if(number<0){
            System.out.println("false");
            return -1;
        }
        int sum = 0;
        while (number>0){
            //to extract least significant digit eg 125 -> 125%10 = 12(add them) -> 12*10 = 120 -> 125-120 = 5(add to 12)
            //1+2+5=8
            int digit = number%10;
            sum += digit;  // sum = sum+digit
            // now 1 and 2 are extracted. we need to extract 5 now. 125/10 will drop 5. since int will drop after
            //     decimal value
            number /= 10; //same as number = number/10
        }
        System.out.println(sum);
        return sum;

            }

        }


