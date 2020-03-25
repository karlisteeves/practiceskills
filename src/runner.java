
public class runner{

    public static void main(String [] args){

        Stack items = new Stack();
        items.push(5);
        items.push(10);
        items.push(15);
        System.out.println(items.pop());

        items.show();
    }


}