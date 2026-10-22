package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    public static void main(String[] args) {
       CellPhone iPhone=  new CellPhone();

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

    }
}
