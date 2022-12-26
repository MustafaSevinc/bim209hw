package edu.estu;

public class User {
    private String userID;
    private Location location;
    private double speed;
    public Location destination;
    Gps gps;

    public User(){
        this.location = new Location(0,0);
        speed = 5;
        userID = "33235aAEQ";
        gps = new Gps();
    }

    public void updateLocation(Location location){
        this.location = location;
        location.setLocation(0,0);
        System.out.println("Location has been updated");
    }

    public void notifyUser(String message){
        System.out.println(message);
    }

    public double getSpeed(){
        speed = this.gps.calculateSpeed();
        notifyUser("Your Speed is "+speed);
        return speed;
    }
}
