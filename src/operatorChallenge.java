public class operatorChallenge {
    public static void main(String[] args) {
        double myFirstVal = 20.00;
        double mySecondVal = 80.00;
        double myThirdVal = (myFirstVal + mySecondVal) * 100;
        double myFourthVal = myThirdVal % 40;

        boolean isNoRemainder = (myFourthVal == 0) ? true : false;
        System.out.println("is noRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }



        //this was my attempt lol
//        boolean leftOver = true;
//        if (myFourthVal == 0){
//            System.out.println("There's nothing left over" );
//        }else{
//            System.out.println(leftOver);
//            System.out.println(myFourthVal);
//        }



    }
}
