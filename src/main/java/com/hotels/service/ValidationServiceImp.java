package com.hotels.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidationServiceImp implements ValidationService {
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public boolean validate(String checkInDate, String checkoutDate) throws ParseException {
        final Date checkIn = DATE_FORMAT.parse(checkInDate);
        final Date checkOut = DATE_FORMAT.parse(checkoutDate);

        if (checkOut.after(checkIn)) return true;
        return false;
    }
}
