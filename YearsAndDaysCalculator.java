//calculate number of years and number of days for given number //of minutes(parameter1).

public class YearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }
public static void printYearsAndDays(long minutes){
    if(minutes<0){
        System.out.println("Invalid value");
    }
    else{
        long numberOfDays = minutes/1440;              //60*24=1440
        long numberOfYears = minutes/525600;           //60*24*365=525600
        long remainderDays = numberOfDays%365;
        System.out.println(minutes + " min= " + numberOfYears + " y " + remainderDays + " d ");
    }
}
}
