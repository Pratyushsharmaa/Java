public class PrimitiveDatatypes {
    public static void main (String[] args) {
        int MaxIntValue = Integer.MAX_VALUE;
        /*This is concept of wrapper class. The wrapper class of int type is Integer. Wrapper class is conversion of
          primitive datatype to object and vice versa. This allows us to work on any datatype. For eg., to work on
          datatype int we used Integer to fetch max, min value.
         */
        int MinIntValue = Integer.MIN_VALUE;
        System.out.println("Max value of int = " + MaxIntValue);   //Max int value is 2147483647
        System.out.println("Min value of int = " + MinIntValue);   //Min int value is -2147483648

        // Now, let's add 1 to max value and subtract 1 from min value and see what happens!
        System.out.println("Extra value than max = " + (MaxIntValue+1)); //overflow
        System.out.println("Lesser value than min " + (MinIntValue+1));  //underflow
        /* We see the value gets reversed. This is because cpu tries to fit the value anyway which results in overflow
        and underflow conditions. */

        //If we pass a literal value to int that is more than max value and less than int value, java will throw an error.

        int max = 2147483648; //integer no too large

    }
}
