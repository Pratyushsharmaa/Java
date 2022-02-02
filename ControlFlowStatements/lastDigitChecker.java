public class lastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit(21,41,54);

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <= 100) || (num2 >= 10 && num2 <= 100) || (num3 >= 10 && num3 <= 100)) {
            int num1lastDigit = num1 % 10;
            int num2lastDigit = num2 % 10;
            int num3lastDigit = num3 % 10;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            if ((num1lastDigit == num2lastDigit) || (num1lastDigit == num3lastDigit) || (num2lastDigit == num3lastDigit)
                    || (num1lastDigit==num2lastDigit && num2lastDigit==num3lastDigit)) {
                return true;

            } else {
                return false;
            }
        } else {
            System.out.println("Invalid input");
        }
        return false;
    }
}
