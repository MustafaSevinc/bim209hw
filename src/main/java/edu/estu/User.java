package edu.estu;

public class User {
    private String userID;
    private Location location;
    private double speed;
    public Location destination;

    public User(){
        this.location = new Location(0,0);
        speed = 5;
        userID = "33235aAEQ";
    }

    public void updateLocation(Location location){
        this.location = location;
        System.out.println("Location has been updated");
    }

    public void notifyUser(String message){
        System.out.println(message);
    }

    public double getSpeed(){
        notifyUser("Your Speed is "+speed);
        return speed;
    }
}
