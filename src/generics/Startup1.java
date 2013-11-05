package generics;

import java.util.ArrayList;
import java.util.List;

public class Startup1 {

    /**
     * In this example we'll use the generic version of List<E> and 
     * ArrayList<E>. See the Java API for more info. Also, see
     * this reference:
     * http://docs.oracle.com/javase/tutorial/java/generics/index.html
     * 
     * @param args the command line arguments are not used
     */
    public static void main(String[] args) {
        // Here we define a list of Strings. The Generic definitions of
        // List and ArrayList allow us to choose any data type
        List<String> stringList = new ArrayList<String>();
        
        // Here's another example using Dog as a data type
        List<Dog> dogList = new ArrayList<Dog>();
        
        // Now let's use our own interface and class ...
        Pair<String, Integer> p1 = 
                new OrderedPair<String, Integer>("Even", 8);
        
        Pair<String, String>  p2 = 
                new OrderedPair<String, String>("hello", "world");
        
        int value = p1.getValue();
        String value2 = p2.getValue();
        
    }
    
}
