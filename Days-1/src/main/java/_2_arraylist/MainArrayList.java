package _2_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {

        // Array
        String[] arr = {"Ali", "Veli", "Hasan", "Ayşe"};

        // ArrayList
        //ArrayList<String> arrx = new ArrayList<>();
        List<String> list = new ArrayList<>();

        // Add item
        list.add("İstanbul");
        list.add("İstanbul");
        list.add("İstanbul");
        list.add("Ankara");
        list.add("İzmir");
        list.add("Zonguldak");
        list.add("Trabzon");
        list.add("Adana");

        //System.out.println(arr);


        // loop
        for( String item : list){
            System.out.println(item);
        }

        // size
        System.out.println("================");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String item = list.get(i);
            System.out.println(item);
        }

        System.out.println("================");
        list.forEach(item -> {
            System.out.println(item);
        });

        // index Control
        int index = 10;
        //String itemIndex = list.get(index);
        // item delete
        if (size > index) {
            list.remove(index);
        }
        int indexOf = list.indexOf("Ankarax");
        System.out.println(indexOf);

        // clear all
        //list.clear();
        //list.removeIf(item -> item.contains("a"));

        //  contains
        boolean contains = list.contains("Ankara");
        System.out.println(contains);

        System.out.println("================");
        System.out.println(list);

        System.out.println("=======Object ArrayList=========");
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setName("Ali");
        u1.setAge(18);
        u1.setSurname("Bilmem");
        u1.setEmail("ali@bilmem.com");

        User u2 = new User("Erkan", "Bil",20, "erkan@bil.com");

        users.add(u1);
        users.add(u2);

        for (User user : users) {
            System.out.println(user);
        }

    }
}
