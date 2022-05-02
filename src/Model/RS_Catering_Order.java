
package model;

import java.util.UUID;

public class RS_Catering_Order {
    private String id;
    private String status;
    private String details;
    private String feedback;
    private RS_Client client;
    private RS_BC_Catering catering;
    private RS_ServiceAgent serviceAgent;

    public RS_Catering_Order(String details) {
//        id = UUID.randomUUID().toString();
        this.details = details;
    }
      public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RS_ServiceAgent getServiceAgent() {
        return serviceAgent;
    }

    public void setServiceAgent(RS_ServiceAgent serviceAgent) {
        this.serviceAgent = serviceAgent;
    }

    public RS_BC_Catering getCatering() {
        return catering;
    }

    public void setCatering(RS_BC_Catering catering) {
        this.catering = catering;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RS_Client getClient() {
        return client;
    }

    public void setClient(RS_Client client) {
        this.client = client;
    }

    public String toString() {
        return details;
    }
}

   