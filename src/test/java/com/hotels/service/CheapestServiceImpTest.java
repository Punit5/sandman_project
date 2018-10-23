package com.hotels.service;


import com.hotels.bean.HotelInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CheapestServiceImpTest {

    @Mock
    private AllHotelService allHotelService;

    private CheapestServiceImp cheapestServiceImp;

    final String locationToTest = "YVY";
    final String dateToTest = "2018-05-06";

    @Before
    public void setUp() throws Exception {
        cheapestServiceImp = new CheapestServiceImp(allHotelService);

    }

    @Test
    public void getHotelNull() {
        assertEquals(cheapestServiceImp.getHotel(locationToTest, dateToTest, dateToTest),
                Collections.EMPTY_LIST);
    }

    @Test
    public void getHotelLessThanThree() {
        final List<HotelInfo> hotelInfos = Stream.of(new HotelInfo.Builder("abc")
                .withAddress("Vancouver")
                .withPhoneNumber(9999999)
                .withPrice(20.0).buid()).collect(Collectors.toList());


        when(allHotelService.getInfo(locationToTest, dateToTest, dateToTest)).thenReturn(hotelInfos);
        assertEquals(cheapestServiceImp.getHotel(locationToTest, dateToTest, dateToTest), hotelInfos);
    }

    @Test
    public void getHotel() {
        final HotelInfo.Builder builder = new HotelInfo.Builder("XYz")
                .withAddress("Vancouver")
                .withPhoneNumber(9090);

        final HotelInfo hotelInfo1 = builder.withPrice(20.0).buid();
        final HotelInfo hotelInfo2 = builder.withPrice(10.0).buid();
        final HotelInfo hotelInfo3 = builder.withPrice(50.0).buid();
        final HotelInfo hotelInfo4 = builder.withPrice(40.0).buid();

        when(allHotelService.getInfo(locationToTest, dateToTest, dateToTest)).thenReturn(Stream.of(hotelInfo1,
                hotelInfo2,
                hotelInfo3,
                hotelInfo4).collect(Collectors.toList()));

        assertEquals(cheapestServiceImp.getHotel(locationToTest, dateToTest, dateToTest),
                Stream.of(hotelInfo2, hotelInfo1, hotelInfo4).collect(Collectors.toList()));
    }
}
