package com.pluralsight;
import java.util.*;
public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
        //getter for 'serialNumber'
        public int getserialNumber() {
            return serialNumber;
        }

        // Setter for 'serialNumber'
        public void setserialNumber(int serialNumber){
            this.serialNumber = serialNumber; // 'this' keyword distinguishes the class variable from the parameter
        }



        // Getter for 'model'
        public String getmodel() {
            return model;
        }

        // Setter for 'model'
        public void setmodel(String model){
            this.model = model; // 'this' keyword distinguishes the class variable from the parameter
        }


        // Getter for 'carrier'
        public String getcarrier() {
            return carrier;
        }

        // Setter for 'carrier'
        public void setcarrier(String carrier){
            this.carrier = carrier; // 'this' keyword distinguishes the class variable from the parameter
        }


        // Getter for 'phoneNumber'
        public String getphoneNumber() {
            return phoneNumber;
        }

        // Setter for 'phoneNumber'
        public void setphoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber; // 'this' keyword distinguishes the class variable from the parameter
        }


        // Getter for 'owner'
        public String getowner() {
            return owner;
        }

        // Setter for 'owner'
        public void setowner(String owner){
            this.owner = owner; // 'this' keyword distinguishes the class variable from the parameter
        }

}




