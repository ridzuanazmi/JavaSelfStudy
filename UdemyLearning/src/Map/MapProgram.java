package Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        // Map<Key, Value>
        Map<String, String> languages = new HashMap<>();

        // add the key and the value in languages Map
        // if the put method get called for the same key, the value will be overridden
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python",
                "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        // print out the value by 'getting the key
        System.out.println(languages.get("Java"));

        // check the map if it contains a key or not
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println("=======================================================");

    //  remove method of map. returns true if key and value pair matches
        // languages.remove("Lisp"); // remove the key also removes its values
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp","Therein lies madness", "a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("List was not replaced");
        }
    //  Print out all the maps content by looping through the map using keySet()
    //  method
    //  that returns a set of all the keys in the map
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
