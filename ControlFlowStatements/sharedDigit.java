public class sharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(22,52);
        hasSharedDigit(21,45);

    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) || (num2 >= 10 && num2 <= 99)) {
            int num1lastDigit = num1 % 10;
            int num2lastDigit = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            int num1firstDigit = num1;
            int num2firstDigit = num2;
            System.out.println("Any shared digits?");
            return ((num1firstDigit == num2firstDigit) || (num1lastDigit == num2lastDigit) || (num1firstDigit==num2lastDigit)
            || (num1lastDigit == num2firstDigit));
        } else {
            System.out.println("Invalid input");
        }
        return false;
    }
}
