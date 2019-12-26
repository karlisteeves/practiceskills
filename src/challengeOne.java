public class challengeOne {

    public static void main(String[] args) {
        byte myByte = 25;
        short myShort = 1000;
        int myInt = 1340;
        long myLong = 50000L + 10L * (myByte + myShort + myInt) ;
        System.out.println("the total of the long is " +myLong);

        convert();
//        System.out.println(kilogram);
    }


    //challenge two, convert pounds to kilograms

    public static void convert(){
        double pounds = 200d;
        double kilogram = pounds / 2.2046d;
        System.out.println(kilogram);
    }
}
