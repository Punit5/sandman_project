package com.hotels.service;

import com.hotels.bean.HotelInfo;

import java.util.List;

/**
 * At the moment , I am unable to get the api key , to make the actual call.
 * So , just mocking a universal response , for all request. Just to test that the
 * overall service is working correctly.
 */
public class MockAllHotelService implements AllHotelService {

    @Override
    public List<HotelInfo> getInfo(String location, String checkinDate, String checkOutDate) {
        /*return Stream.of(new HotelInfo.Builder("ABC hotel")
                .withAddress("vancouer")
                .withContact(9090)
                .withPrice(20.0)
                .buid()).collect(Collectors.toList());*/
        return null;
    }
}
