package m49_maps;

import java.util.*;

public class IteratingThroughMaps {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "Arthur");
        map.put("gender", "Male");
        map.put("age", 35);
        map.put("job_title", "Software Developer");
        map.put("salary", 140000.0);
        map.put("full_time", true);

        System.out.println(map);

        for (String eachKey : map.keySet()) {
            System.out.println(eachKey + ": " + map.get(eachKey));
        }

        System.out.println("------------------------");

        for (Object eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("------------------------");

        for (Map.Entry<String, Object> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getKey() + ": " + eachEntry.getValue());
        }

        System.out.println("------------------------");

        System.out.println(map);

        Iterator<String> itr= map.keySet().iterator();

        while(itr.hasNext()){
            String key = itr.next();
            System.out.println(key);
            if(map.get(key).equals("Arthur")){
                itr.remove();
            }
        }

        System.out.println(map);

        System.out.println("------------------------");

        map.forEach( (k, v) -> System.out.println(k + ": " + v) );

        System.out.println("------------------------");

        Map<String, Object> person1 = new HashMap<>();
        person1.put("name", "Isabella");
        person1.put("gender", "Female");
        person1.put("age", 39);

        Map<String, Object> person2 = new HashMap<>();
        person2.put("name", "Yulia");
        person2.put("gender", "Female");
        person2.put("age", 32);

        Map<String, Object> person3 = new HashMap<>();
        person3.put("name", "Aaron");
        person3.put("gender", "Male");
        person3.put("age", 45);

        List<Map<String, Object>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
                person1, person2, person3
        ));

        System.out.println(listOfMap);

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

    }
}
