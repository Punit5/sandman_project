package com.hotels.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Punit on 2018-10-23.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

    private String property_name;

    private Address address;

    private TotalPrice total_price;

    private List<Contact> contacts;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public TotalPrice getTotal_price() {
        return total_price;
    }

    public void setTotal_price(TotalPrice total_price) {
        this.total_price = total_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Results results = (Results) o;

        if (property_name != null ? !property_name.equals(results.property_name) : results.property_name != null)
            return false;
        if (address != null ? !address.equals(results.address) : results.address != null) return false;
        if (total_price != null ? !total_price.equals(results.total_price) : results.total_price != null) return false;
        return contacts != null ? contacts.equals(results.contacts) : results.contacts == null;

    }

    @Override
    public int hashCode() {
        int result = property_name != null ? property_name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (total_price != null ? total_price.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        return result;
    }
}
