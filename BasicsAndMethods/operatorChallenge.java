//operators challenge.
// 1. create a double variable of 20.00.
// 2. create a second variable of type double with value 80.00.
// 3.Add both numbers and multiply by 100.00.
// 4. Use the remainder operator to calculate remainder.

public class Main {

    public static void main(String[] args) {
	double first = 20.00d;
	double second = 80.00d;
	double result = (first+second) * 100.00d;
        System.out.println(result);
      double remainder_result = result%40.00d;
        System.out.println(remainder_result);
        boolean isZero = (remainder_result == 0) ? true : false;
        System.out.println(isZero);

        if (isZero == true) {
            System.out.println("Got some remainder");
        }
    }
}
