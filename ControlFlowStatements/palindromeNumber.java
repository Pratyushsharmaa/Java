public class palindromeNumber {
    public static void main(String[] args) {
        isPalindrome(1221);
        isPalindrome(3411);
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        while(number>0){
            int lastDigit = number%10;  //to extract last digit
            reverse =   reverse*10 + lastDigit; //increasing place value and combining last digit
            number = number/10; //drop last digit

        }
        if(reverse==originalNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        return false;
    }
}
