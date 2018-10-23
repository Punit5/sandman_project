package com.hotels.util;

import com.hotels.bean.HotelInfo;

import java.util.Comparator;

public class HotelPriceSort implements Comparator<HotelInfo> {

    public int compare(HotelInfo o1, HotelInfo o2) {
        return o1.getTotalPrice().compareTo(o2.getTotalPrice());
    }
}
