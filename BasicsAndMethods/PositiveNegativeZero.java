//if the given number is positive, negative or zero.

public class PositiveNegativeZero {
        public static void main(String[] args) {
       // checkNumber(5);             main to check the code
        //checkNumber(-10);
        //checkNumber(0);
        }
        public static void checkNumber(int number) {           //method syntax
         if(number>0) {
                 System.out.println("positive");
         }
         else if(number<0) {
                 System.out.println("negative");
         }
         else if(number==0){
                 System.out.println("zero");
         }
         else
             System.out.println("Invalid input");
        }
}
