public class Main {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 500, 5,100);
        System.out.println("Final score will be " +highScore);

        calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("Randy", 5);

        }




    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static int displayHighScorePosition(String playersName, int highScorePosition){


        System.out.println(playersName + " managed to get into position " +highScorePosition + " on the table.");

        return highScorePosition;
    }

//void means don't send anything back, do not return anything
}
