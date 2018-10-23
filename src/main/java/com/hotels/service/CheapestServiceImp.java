package com.hotels.service;

import com.hotels.bean.HotelInfo;
import com.hotels.util.HotelInfoComparatorFactory;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CheapestServiceImp implements CheapestService {


    private static final int MAX_RESULTS = 3;

    private final AllHotelService allHotelService;

    public CheapestServiceImp(AllHotelService allHotelService) {
        this.allHotelService = allHotelService;
    }


    public List<HotelInfo> getHotel(String code, String checkInDate, String checkOutDate) {
        List<HotelInfo> info = allHotelService.getInfo(code, checkInDate, checkOutDate);
        if (info == null || info.isEmpty())
            return Collections.emptyList();
        if (info.size() <= MAX_RESULTS)
            return info;
        Collections.sort(info, HotelInfoComparatorFactory.getComparator(HotelInfoComparatorFactory.SORT_TYPE.PRICE));
        return info.subList(0, MAX_RESULTS);
    }
}
