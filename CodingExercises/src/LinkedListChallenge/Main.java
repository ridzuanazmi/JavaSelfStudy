package LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * Create a LinkedList functionality to create a list of places, ordered by
 * distance from the starting point, Sydney
 * Adelaide: 1374km | Alice Springs: 2771km | Brisbane: 917km | Darwin: 3972km
 * Melbourne: 877km | Perth: 3923km
 */

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%dkm)", name, distance);
    }
}

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // instantiate LinkedList
        var placesAussie = new LinkedList<Place>();

        // add elements in LinkedList
        placesAussie.addFirst(new Place("Sydney", 0));
        addPlaces(placesAussie, new Place("Adelaide", 1374));
        addPlaces(placesAussie, new Place("Brisbane", 917));
        addPlaces(placesAussie, new Place("Perth", 3923));
        addPlaces(placesAussie, new Place("Alice Springs", 2771));
        addPlaces(placesAussie, new Place("Darwin", 3972));
        addPlaces(placesAussie, new Place("Melbourne", 877));

        System.out.println(placesAussie);

        // instantiate ListIterator of placesAussie LinkedList
        var iterator = placesAussie.listIterator();
        boolean shutdown = false;
        boolean forward = true;

        loop: while (!shutdown) {
            // print out start of the list
            if (!iterator.hasPrevious()) {
                System.out.println("Start point: " + iterator.next());
                forward = true;
            }
            // print out last place of the list if reached
            if (!iterator.hasNext()) {
                System.out.println("Final point: " + iterator.previous());
                forward = false;
            }
            printMenu();
            System.out.print("Enter value: ");
            switch (scanner.nextLine().trim().toUpperCase().substring(0, 1)) {
                case "F":
                    if (!forward) {
                        forward = true; // reversing direction
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println("The next place is: " + iterator.next());
                    }
                    break;
                case "B":
                    if (forward) {
                        forward = false; // reversing direction
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("The previous place is: " + iterator.previous());
                    }
                    break;

                case "L":
                    printItinerary(placesAussie);
                    break;
                case "Q":
                    System.out.println("The program will quit");
                    break loop;
                default:
                    System.out.println("Entered invalid character" +
                            "\nRe-enter selection");
                    break;
            }
        } // end of while loop

    } // end of main

    private static void addPlaces(LinkedList<Place> list, Place p) {

        // check for any duplicates
        // if (list.contains(p)) {
        // System.out.println("Found duplicate: " + p);
        // }

        // check for any duplicates and ignores cases like capital letters etc
        for (Place place : list) {
            if (place.name().equalsIgnoreCase(p.name())) {
                System.out.println("Found duplicate: " + p);
                return;
            }
        }

        // add according to the ascending distance variable of Place
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (p.distance() < listPlace.distance()) {
                list.add(matchedIndex, p);
                return;
            }
            matchedIndex++;
        }

        list.add(p);

    } // end of addPlaces

    private static void printItinerary(LinkedList<Place> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        Place previousTown = list.getFirst();
        ListIterator<Place> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var destination = iterator.next();
            System.out.println("---> From: " + previousTown + " to " +
                    destination);
            previousTown = destination;
        }
        System.out.println("Trip ends at: " + list.getLast());
    } // end of print itinerary

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (Q)uit """);
    } // end of printMenu
}
