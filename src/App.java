
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        HashSet<String> ages = new HashSet<String>();
        HashMap<Integer, String> names = new HashMap<Integer, String>();
        ArrayList<String> hair = new ArrayList<String>();
        
        //HashMap Names
        names.put(1, "Roberto");
        names.put(2, "Rodrigo");
        names.put(3, "Rafael");

        //HashSet ages
        ages.add("20");
        ages.add("30");
        ages.add("40");

        //ArrayList hair
        hair.add("brown");
        hair.add("black");
        hair.add("blonde");

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        int c=1;
        for(String age : ages){
            System.out.println("The age of "+c + " is " + age);
            c++;
        }

        c=1;
        for(String h : hair){
            System.out.println("The hair of the number " + c + " is " + h);
            c++;
        }


    }
}
