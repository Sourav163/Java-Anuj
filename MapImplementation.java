package Java_with_Anuj_Bhaiya;

import java.util.Map;
import java.util.HashMap;

public class MapImplementation {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("RU", "Russia");
        map.put("IN", "India");
        map.put("IN", "Bharat");
        map.putIfAbsent("IN", "India");
        map.put("SL", "Sri Lanka");
        map.put("SA", "South Africa");

        System.out.println("map = " + map);
        System.out.println("map.remove(\"SL\") = " + map.remove("SL"));

        System.out.println("map = " + map);
        System.out.println("map.remove(\"SA\", \"South America\") = " + map.remove("SA", "South America"));

        System.out.println("map = " + map);
        System.out.println("map.containsKey(\"IN\") = " + map.containsKey("IN"));
        System.out.println("map.containsValue(\"India\") = " + map.containsValue("India"));

        System.out.println("map.get(\"IN\") = " + map.get("IN"));
        System.out.println("map.getOrDefault(\"EN\", \"Not Available\") = " + map.getOrDefault("EN", "Not Available"));

        System.out.println("map.keySet() = " + map.keySet()); // returns a set of key string.
        System.out.println("map.values() = " + map.values()); // returns a collection of value string because there may be duplicate values.
        System.out.println("map.entrySet() = " + map.entrySet()); // returns an array of "key=value" pairs.
    }
}
