//To understand strings and perform different operations.

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	String MyString = "This is a string";
        System.out.println(MyString);

        System.out.println("Hi " + MyString);

        MyString = MyString + " more string";
        System.out.println(MyString);

        MyString = MyString + " \u00A9 2021";
        System.out.println(MyString);

        String NumberString = "23.33";
        System.out.println("45.57" + NumberString); // it will append
        //string is immutable, i.e., it can't be deleted once created. It will just append the previous string.

    }
}
