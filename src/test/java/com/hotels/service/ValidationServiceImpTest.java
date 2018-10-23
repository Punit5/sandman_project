package com.hotels.service;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class ValidationServiceImpTest {

    private ValidationService validationService;

    @Before
    public void setUp() throws Exception {
        validationService  = new ValidationServiceImp();
    }

    @Test
    public void validate() throws ParseException {
        assertTrue(validationService.validate("2018-05-02","2018-05-03"));
        assertFalse(validationService.validate("2018-05-03","2018-05-02"));
    }
}