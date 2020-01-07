public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000){
            System.out.println("Your score is " + score);
        } else if (score < 1000) {
            System.out.println("Your score is " + score);
        }else{
            System.out.println("Your score is high!!");
        }



        if (gameOver){ //you can put just gameOver instead of gameOver == true, it does the same thing.
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //scope will deal with the accessibility of certain code in certain areas


        //if you just take the int out, you can use the old variable names and it will just redefine them :0 There are disadvantages to this method, however.
        int secondSore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        int finalScore = secondSore + (newLevelCompleted + newBonus);
        System.out.println("Your NEW final score is " + finalScore);

    }
}
