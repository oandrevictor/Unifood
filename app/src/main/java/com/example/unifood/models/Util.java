package com.example.unifood.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {

    private static Util INSTANCIA;

    public static Util getInstancia() {
        synchronized (Util.class) {
            if (INSTANCIA == null) {
                INSTANCIA = new Util();
            }
            return INSTANCIA;
        }
    }

    public String getCurrentDate() {
        Date date = new Date();
        String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return currentDate;
    }

}
