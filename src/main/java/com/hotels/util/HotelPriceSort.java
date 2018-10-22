package com.hotels.util;

import com.hotels.bean.HotelInfo;

import java.util.Comparator;

public class HotelPriceSort implements Comparator<HotelInfo> {

    public int compare(HotelInfo o1, HotelInfo o2) {
        if(o1.getPrice() < o2.getPrice()) return -1;
        else if(o1.getPrice() > o2.getPrice()) return 1;
        else return 0;
    }
}
