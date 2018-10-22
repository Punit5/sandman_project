package com.hotels.util;

import com.hotels.bean.HotelInfo;

import java.util.Comparator;

public class HotelInfoComparatorFactory {

    public enum SORT_TYPE {
        PRICE
    }

    public static Comparator<HotelInfo> getComparator(final SORT_TYPE sort_type) {
        switch (sort_type) {
            case PRICE:
                return new HotelPriceSort();
            default:
                throw new IllegalStateException("Unhandeled sort_type : " + sort_type);
        }
    }
}
