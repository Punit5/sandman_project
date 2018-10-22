package com.hotels.service;

import com.hotels.bean.HotelInfo;

import java.util.Date;
import java.util.List;

public class SandboxServiceImp implements AllHotelService {

    private static final String url=" https://sandbox.amadeus.com/travel-innovation-sandbox/apis/get/hotels/search-airport";

    //TODO : method to get all hotel info for date provided.
    public List<HotelInfo> getInfo(String location, Date checkinDate) {
        return null;
    }
}
