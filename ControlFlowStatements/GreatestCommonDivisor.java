public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,35));
        System.out.println(getGreatestCommonDivisor(9,15));
    }


    public static int getGreatestCommonDivisor(int first, int second){
        if((first>=10) && (second>=10)){

        int min = Math.min(first, second);
            for(int gcd=min; gcd>0; gcd--){
        if((first%gcd==0) && (second%gcd==0)) {
            return gcd;
        }
        }
    }
        return -1;
    }
}
