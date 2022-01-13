public class PrimitiveDatatypeChallenge {
    public static void main(String[] args) {
        byte MyByteValue = 100;
        short MyShortValue = 234;
        int MyIntValue = 851;
        long MyLongValue = (50000L + (10L * (MyShortValue + MyByteValue + MyIntValue)));
        //remember to specify L.
        System.out.println("My byte value is " + MyByteValue);
        System.out.println("My short value is " + MyShortValue);
        System.out.println("My int value is " + MyIntValue);
        System.out.println("My long value is " + MyLongValue);
    }
}
