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

    }
}
