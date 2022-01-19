//write a method to check whether a number is even or not
//then print all the even numbers between 2 and 20 using that method and while loop.


public class whileLoopProblem {
    public static void main(String[] args) {
        int number = 2;
        int lastNumber = 20;

        while (number <= lastNumber) {
            number++;
            if (!isEven(number)) {
                continue;


            }


            System.out.println(number);
        }
    }

        public static boolean isEven ( int number){
            if (number > 0 && number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

