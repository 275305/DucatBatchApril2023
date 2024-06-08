package concept.of.java;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
	
	public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
 
        // Adding elements to the hashtable
        hashtable.put("Ram", 1);
        hashtable.put("Ravi", 2);
        hashtable.put("Manoj", 3);
 
        // Getting values from the hashtable
        int valueA = hashtable.get("Ram");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the hashtable
        hashtable.remove("Ravi");
 
        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }

}
