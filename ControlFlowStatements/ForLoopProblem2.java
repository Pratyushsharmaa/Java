//write a method with an int parameter and check whether that is odd or not.
//write second method with two int parameters start and end. Print sum of odd numbers in between start and end .





public class ForLoopProblem2 {
    public static void main(String[] args) {
sumOdd(1,100);
    }
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }


    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;

                }
            }
            System.out.println("Sum is " + sum);
        }

        return sum;
    }
}

