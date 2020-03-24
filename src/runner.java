
public class runner{

    public static void main(String [] args){

        Stack items = new Stack();
        items.push(5);
        items.push(8);
        System.out.println(items.peek( ));
        items.push(10);


        System.out.println(items.pop());
        items.show();
    }
}