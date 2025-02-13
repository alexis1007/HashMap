
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HashMap<String, String> names = new HashMap<String, String>();

        names.put("1", "Roberto");
        names.put("2", "Rodrigo");   
        names.put("3", "Rafael");

        //System.out.println(names);

        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
