// To study operators and their abbreviations.

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int result = 10 + 10; //addition
        System.out.println("10+10 = " + result);

        result = result - 15; //subtraction
        System.out.println("20-15 = " +result);

        result = result * 6; //multiplication
        System.out.println("5*6 = " +result);

        result = result / 10; //division
        System.out.println("30/10 = " +result);

        result = result % 2; //modulus
        System.out.println("Remainder of 3/2 = " +result);

        //Abbreviations of operators

        //result = result + 1;
        result++;
        //result = result==; This will be wrong.
        System.out.println(result);

        //result = result - 1;
        result--;
        System.out.println(result);

        //result = result + 2;
        result+=2;
        System.out.println(result);

        //result = result *5;
        result*=5;
        System.out.println(result);

        //result = result / 3;
        result/=3;
        System.out.println(result);



    }
}
