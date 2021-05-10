package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.models.Reservation;

import java.util.ArrayList;
import java.util.List;

public class createReservation {

    public static Long createReservationNumber (Client client, Reservation rent) {

        List<String> values = new ArrayList<String>();

        values.add(client.getLastName());
        values.add(client.getEmail());
        values.add(String.valueOf(rent.getCategory()));


        long result = 17;
        for (String s : values) {
            if (s != null) {
                result = (37*result + s.hashCode());
                if (result < 0) {
                    (result)*=-1;
                }
            }
        }
        return result;
    }


}
