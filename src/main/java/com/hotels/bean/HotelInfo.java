package com.hotels.bean;

import java.util.Objects;

public class HotelInfo {

    private final String hotelName;
    private final String address;
    private final int phoneNumber;
    private final double price;

    public HotelInfo(String hotelName, String address, int phoneNumber, double price) {
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInfo hotelInfo = (HotelInfo) o;
        return phoneNumber == hotelInfo.phoneNumber &&
                Double.compare(hotelInfo.price, price) == 0 &&
                Objects.equals(hotelName, hotelInfo.hotelName) &&
                Objects.equals(address, hotelInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelName, address, phoneNumber, price);
    }

    @Override
    public String toString() {
        return "HotelInfo{" +
                "hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String hotelName;
        private String address;
        private int phoneNumber;
        private double price;

        public Builder(final String hotelName) {
            this.hotelName = hotelName;
        }

        public Builder withAddress(final String address) {
            this.address = address;
            return this;
        }

        public Builder withPhoneNumber(final int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withPrice(final double price) {
            this.price = price;
            return this;
        }

        public HotelInfo buid() {
            return new HotelInfo(hotelName, address, phoneNumber, price);
        }


    }
}
