package JavaMaps;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.putIfAbsent("in","India2"); //it won't overwrite the value of key "in", using put with same key "in" would have overwritten it.
        map.put("en", "England");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

//        ArrayList<String> keys = new ArrayList<>(map.keySet());
//
//        ArrayList<String> values = new ArrayList<>(map.values());
//
//        System.out.println(keys);
//        System.out.println(values);

//        map.remove("us");
//        map.remove("in", "InDia"); //Won't remove anything coz InDia is no value present in map.
//
//        System.out.println(map.containsKey("in"));
//        System.out.println(map.containsKey("pn"));
//
//        System.out.println("Contains Value: "+ map.containsValue("India"));
//
//        System.out.println(map);
//
//        System.out.println(map.get("en"));
//        System.out.println(map.get("cn"));
//        System.out.println(map.getOrDefault("cn", "Others"));
    }
}
