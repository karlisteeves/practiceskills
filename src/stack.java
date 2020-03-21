import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Stack;

public class stack {

public static void main (String [] args){
    Stack<String> games = new Stack<String>();
    games.add("Animal Crossing");
    games.add("Fire Emblem");
    games.add("Pokemon");

    System.out.println(games.peek());

    System.out.println(games);
}

}
