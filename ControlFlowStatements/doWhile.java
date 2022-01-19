//Introduction to do-while loop: syntax
//do{
//code to be executed / loop body
//update statement
//        }while (condition);




public class doWhile {
    public static void main(String[] args) {


        int count = 1;
        do {                                    //do will execute atleast once.
            System.out.println(count);
            count++;
        }
        while (count != 6);
    }
}

