package edu.estu;

public class TrafficConditions {
    private double[] lat;
    private double[] lon;
    private int[] conditionType;
    private int count;
    Server server = new Server();

    public TrafficConditions(){
        Server server = new Server();
    }

    public TrafficConditions getTrafficConditions(){
        TrafficConditions trafficConditions = new TrafficConditions();
        server.downloadTrafficConditions();
        return trafficConditions;
    }

    public String[] findConditionInMyArea(Location area){
        String[] trafficConditions = {};
        server.downloadTrafficConditions();
        return trafficConditions;
    }
}
