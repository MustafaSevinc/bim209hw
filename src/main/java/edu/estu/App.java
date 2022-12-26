package edu.estu;


public class App 
{
    public static void main( String[] args )
    {
        useCase3();
    }

    public static void useCase1(){
        System.out.println("-------------------USE CASE 1-------------------");
        MainAppInterface mainApp = new MainAppInterface();
        System.out.println("Mode Navigation Selected");
        System.out.println("Please enter your Destination");
        Location destination = new Location(37.4913,12.2968);
        mainApp.CalculateRoute(destination);
        mainApp.getSpeed();
    }
    public static void useCase2(){
        System.out.println("-------------------USE CASE 2-------------------");
        MainAppInterface mainApp = new MainAppInterface();
        TrafficConditions trafficConditions = new TrafficConditions();
        trafficConditions.getTrafficConditions();

    }

    public static void useCase3(){
        System.out.println("-------------------USE CASE 3-------------------");
        MainAppInterface mainApp = new MainAppInterface();
        Location location = mainApp.gps.getLocationFromGPS();
        mainApp.getSpeed();
        TrafficConditions trafficConditions = new TrafficConditions();
        trafficConditions.getTrafficConditions();
        System.out.println("Comparing Current Locations Traffic with Traffic Conditions...");
        trafficConditions.findConditionInMyArea(location);

    }
}
