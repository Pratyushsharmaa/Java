//to stude if

public class Main {

    public static void main(String[] args) {
	boolean isGame = true;
	int score = 5000;
	int bonus = 50;
	int level = 5;

        {
            if(score>1000 && score<6000){
               int finalScore = score + (level*bonus);
            System.out.println("" +finalScore); }
        }
    }
}
