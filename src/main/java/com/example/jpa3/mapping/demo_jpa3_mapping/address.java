package com.example.jpa3.mapping.demo_jpa3_mapping;
import javax.persistence.Embeddable;

@Embeddable
public class address {
    private String streetnumber;
    private String location;
    private String state;



    public String getStreetNumber() {
        return streetnumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetnumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
