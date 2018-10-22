package com.hotels.service;

import com.hotels.bean.HotelInfo;

import java.util.Date;
import java.util.List;

public interface AllHotelService {

    /**
     * Service to get all hotel info for checkin Date
     * @param location
     * @param checkinDate
     * @return
     */

    public List<HotelInfo> getInfo(final String location, final Date checkinDate);
}
