public class numberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(1999);
        isLeapYear(2321);
        isLeapYear(-1);
        getDaysInMonth(1,1999);
        getDaysInMonth(2,2000);
        getDaysInMonth(2,2007);
        getDaysInMonth(6,2008);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                return true;
            } else {
                return false;
            }

        } else {
            System.out.println("false");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year ){
        if((month>=1 && month<=12) && (year>=1 && year<=9999)) {

            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        System.out.println("29 because leap year");

                    } else {
                        System.out.println("28 because not a leap year");

                    }
                    break;


                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                default:
                    System.out.println("Invalid");
                    break;

            }
        }

        return month;
    }

}