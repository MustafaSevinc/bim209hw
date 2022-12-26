package edu.estu;

public class TrafficConditions {
    private double[] lat;
    private double[] lon;
    private int[] conditionType;
    private int count;

    public TrafficConditions getTrafficConditions(){
        TrafficConditions trafficConditions = new TrafficConditions();
        System.out.println("Traffic Conditions Gotten.");
        return trafficConditions;
    }

    public String[] findConditionInMyArea(Location area){
        String[] trafficConditions = {};
        System.out.println("Traffic Conditions In Your Area Found.");
        return trafficConditions;
    }
}
