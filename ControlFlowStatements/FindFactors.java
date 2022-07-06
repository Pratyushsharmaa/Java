public class FindFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(10);
        printFactors(-1);
    }
    public static int printFactors(int number){
        if(number<1){
            System.out.println("Invalid input");
        } else if (number>=1) {
            for(int i=number; i>0; i--) {
                int factor = number / i;
                if (number % i == 0)
                    System.out.println(factor);
            }

        }
        return -1;
    }

}
