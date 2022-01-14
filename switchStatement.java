public class switchStatement {
    public static void main(String[] args) {
       /* int value=1;
        if(value==1){
            System.out.println("Value was 1");
        }
        else if(value==2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Value was neither 1 nor 2");
        }
        */

        //alternate code using switch

        int switchValue = 4 ;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;                                  //to terminate one case else it will merge with other cases

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:                                   //shortcut for multiple cases
            System.out.println("was 3, or 4, or 5");
            break;

            default:
                System.out.println("Neither 1 nor 2");
                break;
        }
    }
}