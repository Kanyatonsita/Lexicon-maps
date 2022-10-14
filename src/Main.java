import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String>  dictionary = new HashMap<>();


        dictionary.put("hej","hello");
        dictionary.put("middag","dinner");
        dictionary.put(" fantastiskt","fantastic");

        System.out.println(dictionary.get("hej"));

        for (String key : dictionary.keySet()){
            System.out.println("Swedish :" + key);
            System.out.println("English: " + dictionary.get(key));
        }
    }
}