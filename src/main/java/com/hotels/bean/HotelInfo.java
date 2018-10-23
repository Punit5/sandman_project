package com.hotels.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo {

    @JsonProperty(value = "property_name")
    private String hotelName;
    @JsonProperty(value = "address")
    private Address address;
    @JsonProperty(value = "contacts")
    private List<Contact> contacts;
    @JsonProperty(value = "total_price")
    private TotalPrice totalPrice;

    public HotelInfo() {
    }

    public HotelInfo(String hotelName, Address address, List<Contact> contacts, TotalPrice totalPrice) {
        this.address = address;
        this.hotelName = hotelName;
        this.contacts = contacts;
        this.totalPrice = totalPrice;
    }

    public Address getAddress() {
        return address;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getHotelName() {
        return hotelName;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelInfo hotelInfo = (HotelInfo) o;

        if (hotelName != null ? !hotelName.equals(hotelInfo.hotelName) : hotelInfo.hotelName != null) return false;
        if (address != null ? !address.equals(hotelInfo.address) : hotelInfo.address != null) return false;
        if (contacts != null ? !contacts.equals(hotelInfo.contacts) : hotelInfo.contacts != null) return false;
        return totalPrice != null ? totalPrice.equals(hotelInfo.totalPrice) : hotelInfo.totalPrice == null;

    }

    @Override
    public int hashCode() {
        int result = hotelName != null ? hotelName.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelInfo{" +
                "address=" + address +
                ", hotelName='" + hotelName + '\'' +
                ", contacts=" + contacts +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder {
        private String hotelName;
        private Address address;
        private List<Contact> contacts;
        private TotalPrice totalPrice;

        public Builder(final String hotelName) {
            this.hotelName = hotelName;
        }

        public Builder withAddress(final Address address) {
            this.address = address;
            return this;
        }

        public Builder withContact(final List<Contact> contacts) {
            this.contacts = contacts;
            return this;
        }

        public Builder withPrice(final TotalPrice price) {
            this.totalPrice = price;
            return this;
        }

        public HotelInfo buid() {
            return new HotelInfo(hotelName, address, contacts, totalPrice);
        }


    }
}
