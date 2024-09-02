package _4_map;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {

        // HashMap
        HashMap<String, String> map1 = new HashMap<>();
        Map<String, Object> map = new HashMap<>();

        // add item
        map.put("name", "Erkan");
        map.put("name", "Kemal");
        map.put("age", 30);
        map.put("surname", "Bilmem");
        map.put("email", "erkan@mail.com");
        map.put("status", true);

        // get item
        System.out.println( map.get("name") );
        System.out.println( map.getOrDefault("title", "App Title") );

        // remove item
        // map.remove("name");
        //map.clear();

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Object object = map.get(key);
            if (object instanceof Integer) {
                int intValue = (Integer) object;
            }
            System.out.println(key + " - " + object);
        }

        // lambda loop
        System.out.println("==================");
        map.forEach((k, v) ->
                System.out.println(k + " - " + v)
        );

        int size = map.size();
        System.out.println(size);

        map.replace("name", "Erkan");
        map.put("name", "Kenan");

        System.out.println(map);

        List<Map<String, Object>> ls = new ArrayList<>();
        Map<String, Object> m1 = new HashMap<>();
        m1.put("name", "Kemal");
        m1.put("age", 25);
        m1.put("surname", "bil");
        m1.put("email", "kenan@mail.com");
        m1.put("status", true);

        Map<String, Object> m2 = new HashMap<>();
        m2.put("name", "Ali");
        m2.put("age", 12);
        m2.put("surname", "Bilsin");
        m2.put("email", "ali@mail.com");
        m2.put("status", true);
        m2.put("city", "Ankara");

        ls.add(map);
        ls.add(m1);
        ls.add(m2);

        System.out.println(ls);

    }
}
