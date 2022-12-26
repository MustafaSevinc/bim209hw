package edu.estu;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude,double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Location getLocation(){
        System.out.println("Location has gotten.");
        return this;
    }

    public Location setLocation(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
        System.out.println("Location has set");
        return this;
    }
}
