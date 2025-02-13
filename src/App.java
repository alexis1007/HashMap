
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> names = new HashMap<Integer, String>();

        names.put(1, "Roberto");
        names.put(2, "Rodrigo");   
        names.put(3, "Rafael");

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
