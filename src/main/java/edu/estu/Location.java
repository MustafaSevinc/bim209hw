package edu.estu;

public class Location {
    private double latitude;
    private double longitude;

    public Location getLocation(){
        Location location = new Location();
        System.out.println("Location has gotten.");
        return location;
    }

    public Location setLocation(double lat, double lon){
        Location location = new Location();
        location.latitude = lat;
        location.longitude = lon;
        System.out.println("Location has set");
        return location;
    }
}
