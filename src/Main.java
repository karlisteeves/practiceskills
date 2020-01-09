public class Main {

    public static void main(String[] args) {


        calculateScore(true, 500, 5,100);

        calculateScore(true, 10000, 8, 200);

        }




    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }

//void means don't send anything back, do not return anything
}
