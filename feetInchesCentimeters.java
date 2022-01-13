/*    
       parameter1 calculates centimeter = x feet and y inches
       parameter2 calculates inches = x feet                                */


public class feetInchesCentimeters {
    public static void main(String[] args) {                        //main to check result
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(7,13);
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(12.5);
        calcFeetAndInchesToCentimeters(-1);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<=0) || (inches<=0 || inches>=12 )){
            System.out.println("Invalid input");
            return -1;
        }
        double centimeters = (feet*12) * 2.54;
        centimeters += (inches * 2.54);            // += because we need to add this in previous line's output

        if(((feet>=0) || (inches>=0 && inches<=12 ))) {
            System.out.println(feet + " feet " +  inches + " inches =  " + centimeters + "cm");
        }
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<=0) {
            System.out.println("Invalid input");
            return -1;
        }
        else if(inches>=0){
            double feet = inches / 12;
            System.out.println(inches + " inches= " + feet + " feet ");
        }

        return inches;
    }
}
