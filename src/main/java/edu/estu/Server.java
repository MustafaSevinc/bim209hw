package edu.estu;

public class Server {
    private String serverDomain;
    private String serverDomainBackup;
    public int timeOutDuration = 5;

    public String[] downloadTrafficConditions(){
        String[] trafficConditions = {};
        System.out.println("New Conditions Gotten");
        return trafficConditions;
    }

    public void uploadNewConditions(String[] newConditions){
        System.out.println("New Conditions Uploaded");
    }

}
