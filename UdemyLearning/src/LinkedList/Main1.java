package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main1 {
    
    public static void main(String[] args) {
        
        // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>(); 

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra"); // will display first

        // LIFO data collection
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println("After adding elements: " + placesToVisit);

        // removeElements(placesToVisit);
        // System.out.println("After removing elements: " + placesToVisit);

        // gettingElements(placesToVisit);

        // printItinerary(placesToVisit);
        // printItinerary2(placesToVisit);
        // printItinerary3(placesToVisit);
        testIterator(placesToVisit);

    } // end of main

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // queue methods
        list.offer("Melbourne"); // adds last into LinkedList
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        // stack methods
        list.push("Alice Springs"); 

    } // end of addMoreElements

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");

        // Queue/deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); // removes Last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");

    } // end of removeElements

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved element: " + list.get(4));
        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + 
        list.indexOf("Melbourne"));

        // queue retrieval method FIFO
        System.out.println("Element from element(): " + list.element());

        // stack retrieval methods
        System.out.println("Element from peek(): " + list.peek());
        System.out.println("Element from peekFirst(): " + list.peekFirst());
        System.out.println("Element from peekLast(): " + list.peekLast());

    } // end of gettingElements

    public static void printItinerary(LinkedList<String> list) {
        
        System.out.println("Trip starts at: " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("---> From: " + list.get(i-1)
            + " to " + list.get(i));
        }
        System.out.println("Trip ends at: " + list.getLast());
    } // end of printItinerary

    public static void printItinerary2(LinkedList<String> list) {
        
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        for (String destination : list) {
            System.out.println("---> From: " + previousTown + " to " +
            destination);
            previousTown = destination;
        }
        System.out.println("Trip ends at: " + list.getLast());

    } // end of printItinerary2

    public static void printItinerary3(LinkedList<String> list) {
        
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var destination = iterator.next();
            System.out.println("---> From: " + previousTown + " to " +
            destination);
            previousTown = destination;
        }
        System.out.println("Trip ends at: " + list.getLast());

    } // end of printItinerary3

    private static void testIterator(LinkedList<String> list) {
        
        var iterator = list.listIterator(); // same as below
        // ListIterator<String> iterator = list.listIterator(); 

        while (iterator.hasNext()) {
            // System.out.println("Using iterator: " + iterator.next()); // print every element in the list
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe"); 
                // this add method only works for ListIterator and not Iterator
                // uset the add method on the ListIterator and not on the list itself! 
            }
        }
        // Wont work as the first while loop, is false. 
        // So the second while loop wont get executed
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        // System.out.println(list);

        // will print out in reverse order individually 
        // using hasPrevious() and previous()
        while (iterator.hasPrevious()) {
            System.out.println("has.Previous(): " + iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println("At index 3, previous(): " + iterator2.previous());
        System.out.println("At index 3, next(): " + iterator2.next());

    } // end of testIterator method

}
