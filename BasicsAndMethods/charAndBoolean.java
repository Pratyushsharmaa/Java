//To study char and boolean datatypes. Also about unicodes.

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	char myChar = 'D';
	//see unicode for any letter, signs on the internet!
	char myUnicodeChar = '\u0044'; //0044 is unicode of D.
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        //boolean contain two values true and false.
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println(myTrueBoolean);
        System.out.println(myFalseBoolean);
    }
}
