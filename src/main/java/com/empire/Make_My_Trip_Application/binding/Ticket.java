package com.empire.Make_My_Trip_Application.binding;

public class Ticket {

    private Integer ticketId;
    private String firstName;
    private String lastName;
    private String fromStation;
    private String toStation;
    private Integer ticketCost;
    private String ticketStatus;
    private Integer trainNum;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public Integer getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(Integer ticketCost) {
        this.ticketCost = ticketCost;
    }

    public Integer getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(Integer trainNum) {
        this.trainNum = trainNum;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", ticketCost=" + ticketCost +
                ", ticketStatus='" + ticketStatus + '\'' +
                ", trainNum=" + trainNum +
                '}';
    }
}
