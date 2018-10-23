package com.hotels.service;

import com.hotels.bean.HotelInfo;

import java.util.List;

public interface CheapestService {

    /**
     * Service to get hotel info for three cheap hotel rooms
     *
     * @return three cheapest hotel rooms
     */
    public List<HotelInfo> getHotel(final String code,
                                    final String checkInDate,
                                    final String checkOutDate);
}
