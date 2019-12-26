public class Strings {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
    String myString = "This is a string";
        System.out.println("My string is equal to: " +myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " +myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        //you can't type a number into a string and do math, it will just concat the two strings. If you use an int data type as a second part, it will still concat.
        //Strings are immutable
        String numberString = "234.44";
        numberString = numberString + "49.96";
        System.out.println(numberString);
        String lastString ="10";
        int myInt= 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " +lastString);
    }
}
