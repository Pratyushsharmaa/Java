//Introduction to while loop: syntax
//while (condition){
//code to be executed
//   Increment / decrement statement
//    }



public class whileLoop {
    public static void main(String[] args) {
        //method 1
        int count = 1;
        while(count!=6){
            System.out.println(count);
        count++;//always increment else it will result in infinite loop

        }

        //method 2
        System.out.println("****************"); //for partition between both methods
        count = 1;
        while (true){
            if(count==6){         //will exit loop when count=6
                break;
            }

            System.out.println(count);
            count++;
        }
    }

}
