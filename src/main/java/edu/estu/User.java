package edu.estu;

public class User {
    private String userID;
    private Location location;
    private double speed;
    public Location destination;

    public void updateLocation(Location location){
        this.location = location;
    }

    public void notifyUser(String message){
        System.out.println(message);
    }

}
