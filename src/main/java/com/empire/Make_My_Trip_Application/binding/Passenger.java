package com.empire.Make_My_Trip_Application.binding;

import java.time.LocalDate;
import java.util.Date;

public class Passenger {

    private String firstName;
    private String lastName;
    private LocalDate doj;
    private String fromStation;
    private String toStation;
    private Integer trainNumber;

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

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doj=" + doj +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", trainNumber=" + trainNumber +
                '}';
    }
}
