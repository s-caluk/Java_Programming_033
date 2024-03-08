package m49_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsMethods {
    public static void main(String[] args) {

        Map<String,Object> map=new HashMap<>();
        System.out.println(map);         //{}
        System.out.println(map.size());  //0

        map.put("name", "Arthur");
        map.put("gender", "Male");
        map.put("age", 35);
        map.putIfAbsent("job_title", "Software Developer");
        map.putIfAbsent("salary", 140_000.0);
        map.putIfAbsent("full_time", true);

        System.out.println(map);          //{gender=Male, full_time=true, name=Arthur, salary=140000.0, job_title=Software Developer, age=35}
        System.out.println(map.size());   //6

        System.out.println(map.get("name"));  //Arthur

        map.put("name", "James");
        // map.putIfAbsent("name", "James");  ifAbsent oldugunda güncellemeyi yapmadi.

        System.out.println(map.get("name"));  //James

        //map.clear();                          //{}
        map.remove("age");

        map.remove("full_time", true);

        System.out.println(map);

        System.out.println( map.containsKey("salary") );
        System.out.println(map.containsValue("Female"));

        System.out.println(map.isEmpty());

        Set<String> keys = map.keySet();

        System.out.println(keys);

        Collection<Object> values = map.values();

        System.out.println(values);

        Set<Map.Entry<String, Object>> entries= map.entrySet();

        System.out.println(entries);

    }
}
 /*
Organize the following employee info:
            name         ====>  Arthur
            gender       ====>  Male
            age          ====>  35
            job_title    ====>  Software Developer
            salary       ====>  140000.0
            full_time    ====>  true

*/