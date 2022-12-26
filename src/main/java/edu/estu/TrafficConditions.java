package edu.estu;

public class TrafficConditions {
    private double[] lat;
    private double[] lon;
    private int[] conditionType;
    private int count;
    Server server;

    public TrafficConditions(){
        server = new Server("trafficConditions.com");
    }

    public TrafficConditions getTrafficConditions(){
        server.downloadTrafficConditions();
        return new TrafficConditions();
    }

    public String[] findConditionInMyArea(Location area){
        String[] trafficConditions = {"User Speed and Location Data"};
        server.uploadNewConditions(trafficConditions);
        return trafficConditions;
    }
}
