package com.hotels.controller;

import com.hotels.bean.HotelInfo;
import com.hotels.service.CheapestService;
import com.hotels.service.ValidationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


    @GetMapping(value = "/getDetails", produces = "application/json; charset=UTF-8")
    @ApiOperation(value = "Call to get cheapest three hotel details")
    public List<HotelInfo> greeting(@RequestParam(value = "code", required = true) @ApiParam(value = "airport code ", example = "BOS") String code,
                                    @RequestParam(value = "checkInDate", required = true) @ApiParam(value = "check in date , should be in YYYY-MM-DD format", example = "2018-11-01") String checkInDate,
                                    @RequestParam(value = "checkOutDate", required = true) @ApiParam(value = "check out date , should be in YYYY-MM-DD format", example = "2018-11-02") String checkOutDate) {
        try {
            if (!validationService.validate(checkInDate, checkOutDate))
                throw new IllegalStateException("check out date can't be before check in date");
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
        return cheapestService.getHotel(code, checkInDate, checkOutDate);
    }
}
