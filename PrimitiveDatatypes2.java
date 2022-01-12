/*To study different primitive datatypes, their range and width.

 */

public class PrimitiveDatatypes2 {
    public static void main(String[] args) {
        byte ByteMinimumValue = Byte.MIN_VALUE; //wrapper class for byte is Byte
        byte ByteMaximumValue = Byte.MAX_VALUE;
        System.out.println("Minimum value of byte = " + ByteMinimumValue);
        System.out.println("Maximum value of byte = " + ByteMaximumValue);
        /* We see range of byte is -128 to 127 which is very small than int. If you want lesser range outputs, then use
        byte as it saves a lot of space. Width of byte is 8 whereas width of int is 32. Also to find range: 2^n-1.
         */


        short ShortMinimumValue = Short.MIN_VALUE; //wrapper class for short is Short
        short ShortMaximumValue = Short.MAX_VALUE;
        System.out.println("Minimum value of short = " + ShortMinimumValue);
        System.out.println("Maximum value of short = " + ShortMaximumValue);
        //width of short is 16.

        long LongMinimumValue = Long.MIN_VALUE; //wrapper class for long is Long
        long LongMaximumValue = Long.MAX_VALUE;
        System.out.println("Minimum value of long = " + LongMinimumValue);
        System.out.println("Maximum value of long = " + LongMaximumValue);

        long MyLongValue = 100L; //to declare a long variable specify 'L' at the last of literal.
        System.out.println("Long value is " + MyLongValue);
    }
}
