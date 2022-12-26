package edu.estu;

public class Gps {

    public int sataliteCount;
    public float hdop;

    public double[] getLocationFromGPS(){
        double[] gpsLocation = new double[2];
        System.out.println("GPS Location Gotten.");
        return gpsLocation;
    }

    public double calculateSpeed(){
        double speed = 5;
        System.out.println("Your Speed Gotten.");
        return speed;
    }
}
