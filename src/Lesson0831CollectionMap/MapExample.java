package Lesson0831CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //map storing 2 elements
        //pass 2 data types for key and value
        Map<String, Integer> map = new HashMap<>();

        //add values to Map
        map.put("Bob", 900);
        map.put("John", 920);

        //Print out
        System.out.println(map);
        //get value from key, rasom value su visom tiksliom raid4mis didios
        System.out.println("John's salary: " + map.get("John"));

        //all key value
        System.out.println(map.keySet());

        //print out all the values in a map
        System.out.println(map.values());

        //size
        System.out.println(map.size());

        //check if map contains key
        System.out.println(map.containsKey("Tony"));
        System.out.println(map.containsKey("Bob"));

        //check if map contains value
        System.out.println(map.containsValue(1000));
        System.out.println(map.containsValue(900));

        //remove key/value pair from map if exists
        map.remove("Tony");
        System.out.println(map.remove("Bob"));
        System.out.println(map);

        //example
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Lithuania", "Vilnius");
        capitalCity.put("Fake Estonia", "Tallinn");

        System.out.println(capitalCity.get("Lithuania"));

        //iterate through maps using for each loop
        for (Map.Entry<String, String> entry : capitalCity.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //print out all keys where values is Tallinn
        for (Map.Entry<String, String> entry : capitalCity.entrySet()) {
            if (entry.getValue().equals("Tallinn")) {
                System.out.println(entry.getKey());
            }


        }

    }

}