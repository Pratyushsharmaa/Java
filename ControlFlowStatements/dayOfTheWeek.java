//To calculate day of the week using switch statement.

public class dayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(9);          //main to check output
        printDayOfTheWeek(3);
        printDayOfTheWeek(1);
    }

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
