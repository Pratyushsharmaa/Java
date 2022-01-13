// To study float and double primitive datatypes.

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float MinFloatValue = Float.MIN_VALUE;  //width of float is 32
	    float MaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum float value is " + MinFloatValue);
        System.out.println("Maximum float value is " + MaxFloatValue);


        double MinDoubleValue = Double.MIN_VALUE; //width of double is 64
        double MaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum double value is " + MinDoubleValue);
        System.out.println("Maximum double value is " + MaxDoubleValue);

       // float myFloat = 3.2; shows error because double expected instead of float
        float myFloat = 3.2f; //we can write like this or typecast.

        double myDouble = 2.33d;

        // Let's do division.
        int myInt = 5 / 2;
        float FloatValue = 5f / 2f;
        double DoubleValue = 5d / 2d;

        System.out.println("Int value is " + myInt );
        System.out.println("Float value is " + FloatValue);
        System.out.println("Double value is " + DoubleValue);


    }
}
