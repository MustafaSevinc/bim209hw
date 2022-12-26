package edu.estu;

public class MainAppInterface extends User{
    private int buildVersion;
    private int targetVersion;

    public MainAppInterface(){
        buildVersion = 11;
        targetVersion = 11;
    }

    private void evaluateTrafficCondition(TrafficConditions trafficConditions){
        notifyUser("Finding Best Route...");
    }

    public void CalculateRoute(Location location){
        TrafficConditions trafficConditions = new TrafficConditions();
        notifyUser("Looking For Traffic Conditions...");
        trafficConditions.findConditionInMyArea(location);
        evaluateTrafficCondition(trafficConditions);
        notifyUser("Best Route Found");
    }

    public void setMapLocation(Location location){
        notifyUser("Map Location Set");
    }

    public void updateMapRoute(Location location){
        notifyUser("Route Has Been Updated");
    }

    public void enterDirections(Location location){

    }
}
