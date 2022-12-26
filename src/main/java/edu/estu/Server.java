package edu.estu;

public class Server {
    private String serverDomain;
    private String serverDomainBackup;
    public int timeOutDuration;

    public Server(String serverDomain){
        this.serverDomain = serverDomain;
        serverDomainBackup = "backupTrafficConditions.com";
        timeOutDuration = 5;
    }

    public String[] downloadTrafficConditions(){
        String[] trafficConditions = {};
        System.out.println("Traffic Conditions Received From: "+serverDomain);
        return trafficConditions;
    }

    public void uploadNewConditions(String[] newConditions){
        System.out.println("Connecting to: " + serverDomainBackup);
        System.out.println("New Conditions Updated Using: "+ newConditions[0]);
    }

}
