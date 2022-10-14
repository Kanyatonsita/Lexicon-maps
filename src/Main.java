import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String[]>  dictionary = new HashMap<>();


        dictionary.put("hej",new String[] {"hey"," hello", " hi"});
        dictionary.put("middag",new String[]{"dinner", " supper"});
        dictionary.put(" fantastiskt",new String[]{"fantastic", " great"});

        System.out.println(Arrays.toString(dictionary.get("hej")));

        for (String key : dictionary.keySet()){
            System.out.println("\nSwedish :" + key);
            System.out.println("English: " + Arrays.toString(dictionary.get(key)));
        }
    }
}