// Conversion from Pounds to Kilogram.

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	double PoundsValue = 100d;
        System.out.println("The value in pounds = " + PoundsValue);

        double KilogramValue = PoundsValue * 0.45359237d;
        System.out.println("The value in kilograms = " + KilogramValue);

    }
}
