package _3_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {

        // Set
        Set<String> set = new HashSet<>();

        // Add item
        set.add("Ahmet");
        set.add("Ahmet");
        set.add("Ahmet");
        set.add("Ali");
        set.add("Ali");
        set.add("Erkan");
        set.add("Serkan");
        set.add("Serkan");
        set.add("Zehra");
        set.add("Zehra");

        System.out.println(set);

        Set<Customer> customers = new HashSet<>();
        Customer c1 = new Customer(100, "Erkan", 30);
        Customer c2 = new Customer(101, "Serkan", 25);
        Customer c3 = new Customer(102, "Zehra", 23);
        Customer c4 = new Customer(102, "Zehra", 23);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c3);
        customers.add(c3);
        customers.add(c3);
        customers.add(c3);
        customers.add(c3);
        customers.add(c4);

        System.out.println(customers);

        Set<Customer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(c1);
        linkedSet.add(c1);
        linkedSet.add(c1);
        linkedSet.add(c2);
        linkedSet.add(c2);
        linkedSet.add(c2);
        linkedSet.add(c3);
        linkedSet.add(c3);
        linkedSet.add(c3);
        linkedSet.add(c3);
        linkedSet.add(c4);
        System.out.println(linkedSet);


        // treeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ahmet");
        treeSet.add("Ahmet");
        treeSet.add("Ahmet");
        treeSet.add("Ali");
        treeSet.add("Ali");
        treeSet.add("Erkan");
        treeSet.add("Serkan");
        treeSet.add("Serkan");
        treeSet.add("Zehra");
        treeSet.add("Zehra");
        System.out.println(treeSet);
    }
}
