package com.hotels.service;

import com.hotels.bean.HotelInfo;

import java.util.Date;
import java.util.List;

public interface CheapestService {

    /**
     * Service to get hotel info for three cheap hotel rooms
     * @param code airport code
     * @param date date of request
     * @return three cheapest hotel rooms
     */
    public List<HotelInfo> getHotel(final String code, final Date date);
}
