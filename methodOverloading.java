// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.



public class methodOverloading {
    public static void main(String[] args) {
        calculateScore("Pratyush",100);
        calculateScore(30);
        calculateScore();
    }


    public static int calculateScore(String PlayerName, int Score ){
        System.out.println(" Player " + PlayerName + " scored " + Score);
        return Score;
    }
    public static int calculateScore(int Score){
        System.out.println(" Score is " + Score);
        return Score;
    }
    public static int calculateScore(){
        System.out.println("No name" + " No score");
        return 0;
    }
}
