package MapChallenge;

import java.util.HashMap;
import java.util.Map;

public class Location {
    // fields
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    // constructors
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
    }
    // getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
    //  create a new hash map and passing out exits in the constructor
    //  nothing outside of the Location class can change exits
        return new HashMap<String, Integer>(exits);
    }

    // methods
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
