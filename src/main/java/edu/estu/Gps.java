package edu.estu;

public class Gps {

    public int sataliteCount;
    public float hdop;

    public Gps(){
        sataliteCount =2;
        hdop = 1.523f;
    }

    //TODO: UML DİAGRAMDAN DOUBLE[] YERİNE LOCATİON DÖNDÜRCEK
    public Location getLocationFromGPS(){
        System.out.println("GPS Data Received");
        Location location = new Location(0,0);
        return location.getLocation();
    }

    public double calculateSpeed(){
        double speed = 5;
        System.out.println("Calculating speed...");
        return speed;
    }
}
