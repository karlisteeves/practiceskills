public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " +previousResult);
        result = result -1; // 3 - 1 = 2;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " +previousResult);
        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " +result);

        result = result % 3; // 4 % 3 = 1;
        System.out.println(" 4 % 3 = " + result);

        //result = result + 1;
        result++; //1 + 1 = 2;
        System.out.println("1 + 1 = " +result);

        result--; //2-1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " +result);

        //result = result * 10;
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " +result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " +result);

        boolean isAlien = false;
        if(isAlien == false) { //if you put a semi colon here, you are closing off the execution at this line. Therefore, even if the condition is not met, the next phase of the code will execute regardless. Do NOT do this.
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        } //putting the { after the if is called a codeblock and allows a block of code to be executed, not just a line.

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondScore = 91;
        if((topScore > secondScore) && (topScore < 100)){
            System.out.println("Greater than second score and less than 100!");
        }

        if ((topScore > 90) || (secondScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }
        //logical OR or AND needs TWO &&/|| and operates based on boolean, if not it is a bitwise.

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is a true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not a car");
        }
        //use == to see if something equals to something. just using = will assign that var a value.

        //ternary is scurry but we can figure it out, basically short cuts to if/else statements.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }



}
