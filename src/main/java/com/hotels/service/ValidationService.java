package com.hotels.service;

import java.text.ParseException;

public interface ValidationService {
    public boolean validate(final String checkInDate, final String checkoutDate) throws ParseException;
}
