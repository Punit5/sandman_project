package com.hotels.bean;

/**
 * Created by Punit on 2018-10-23.
 */
public class Address {

    private String line1;

    private String  city;

    private String  region;

    private String postal_code;

    private String country;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (line1 != null ? !line1.equals(address.line1) : address.line1 != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (region != null ? !region.equals(address.region) : address.region != null) return false;
        if (postal_code != null ? !postal_code.equals(address.postal_code) : address.postal_code != null) return false;
        return country != null ? country.equals(address.country) : address.country == null;

    }

    @Override
    public int hashCode() {
        int result = line1 != null ? line1.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (postal_code != null ? postal_code.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
