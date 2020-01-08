public class Main {

    public static void main(String[] args) {

        calculateScore(true, 500, 5,100);
        calculateScore(true, 10000, 8, 200);

        }




    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(score < 5000){
            System.out.println("Your score is " + score);
        } else if (score < 1000) {
            System.out.println("Your score is " + score);
        }else{
            System.out.println("Your score is high!!");
        }
    }


}
