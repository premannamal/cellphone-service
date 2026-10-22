package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    public static void main(String[] args) {
       CellPhone iPhone=  new CellPhone();
       CellPhone cellPhone1 =  new CellPhone();
        CellPhone cellPhone2 =  new CellPhone();

        cellPhone2.setserialNumber(46456);
        System.out.println(cellPhone2.getserialNumber());

        iPhone.setserialNumber(345345);
        System.out.println(iPhone.getserialNumber());

        iPhone.setmodel("iPhone 15 Pro Max");
        System.out.println(iPhone.getmodel());

        iPhone.setcarrier("Verizon");
        System.out.println(iPhone.getcarrier());

        iPhone.setphoneNumber("888-555-1234");
        System.out.println(iPhone.getphoneNumber());

        iPhone.setowner("Sandra");
        System.out.println(iPhone.getowner());

        cellPhone1.setowner("Sai");
        cellPhone1.dial("855-555-2222");

        cellPhone1.setphoneNumber("1-855-239-4503");
        System.out.println("-------");
        display(iPhone);
        display(cellPhone2);


    }

    public static void display(CellPhone phone) {
        System.out.println(phone.serialNumber);
       /* System.out.println(phone.model);
        System.out.println(phone.carrier);
        System.out.println(phone.phoneNumber);
        System.out.println(phone.owner); */
    }
}
