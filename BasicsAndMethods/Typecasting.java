// To study typecasting.


public class Typecasting {

    public static void main(String[] args) {
        int MyIntValue = Integer.MAX_VALUE;
        // byte MyByteValue = (MyIntValue / 2 );
        /* This line will show error because java reads MyByteValue as int and we are asking for byte value. Hence, we need
        to typecast byte to int.
        */

        byte MyByteValue = (byte)(MyIntValue / 2);
        System.out.println("My byte value after casting is " + MyByteValue);

        short MyShortValue = (short)(MyIntValue / 2);
        System.out.println("My short value after casting is " + MyShortValue);

    }

}
