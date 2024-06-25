import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> worldFoods = new HashMap<>();

        worldFoods.put("Italy", "Pasta");
        worldFoods.put("Scotland", "Haggis");
        worldFoods.put("Ireland", "Potato");
        worldFoods.put("England", "Mushy Peas");
        worldFoods.put("Wales", "Rarebit");
        //done to show that the second instance of the unique value overwrites
        worldFoods.put("Italy", "Pizza");

     //first loop shows the key/country
        //        for(String s : worldFoods.keySet()){
//            System.out.println(s);
//        }


        //second loop shows the food type
        //for(String s : worldFoods.values()){
        //    System.out.println(s);
        //}


        //prints the entire content
//        for(Entry<String, String> s : worldFoods.entrySet()){
//            System.out.println(s);
//        }

        System.out.println(worldFoods.isEmpty()); // checks if is empty, returns "true" if empty, else false
        System.out.println(worldFoods.size()); // tells you he count of entries
        worldFoods.put("Spain", "Tapas"); //adds Spain
        System.out.println(worldFoods.size()); // rechecks size
        worldFoods.remove("Italy");
        System.out.println(worldFoods.size());

        //   worldFoods.clear(); //empties the hashmap
        System.out.println(worldFoods.isEmpty());

        //prints the entire contents
        for(Entry<String, String> s : worldFoods.entrySet()){
            System.out.println(s);
        }

        for(String s : worldFoods.values()){
            System.out.println(s);
        }


        // checks if there is an instance of the key
        System.out.println(worldFoods.containsKey("Spain"));
    }
}
