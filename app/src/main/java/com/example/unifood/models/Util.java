package com.example.unifood.models;

import java.text.DateFormat;
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
        Locale br = new Locale("pt","br");
        Date currentDate = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, br);
        df.format(currentDate);

        return currentDate.toString();
    }

}
