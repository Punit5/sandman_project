package com.hotels.controller;

import com.hotels.bean.HotelInfo;
import com.hotels.service.CheapestService;
import com.hotels.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class DetailsController {

    @Autowired
    private CheapestService cheapestService;

    @Autowired
    private ValidationService validationService;


    @RequestMapping("/getDetails")
    public List<HotelInfo> greeting(@RequestParam(value = "code", required = true) String code,
                                    @RequestParam(value = "checkInDate", required = true) String checkInDate,
                                    @RequestParam(value = "checkOutDate", required = true) String checkOutDate) {
        try {
            if (!validationService.validate(checkInDate, checkOutDate))
                throw new IllegalStateException("check out date can't be before check in date");
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
        return cheapestService.getHotel(code, checkInDate, checkOutDate);
    }
}
