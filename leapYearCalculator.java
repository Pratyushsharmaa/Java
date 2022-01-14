//calculate leap year.

public class leapYearCalculator {
   public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(1999);
        isLeapYear(2321);
        isLeapYear(-1);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }

        } else {
            System.out.println("false");
            return false;
        }
    }
}


