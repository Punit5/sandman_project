package com.hotels.bean;

/**
 * Created by Punit on 2018-10-23.
 */
public class Contact {

    private String type;
    private String detail;


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (type != null ? !type.equals(contact.type) : contact.type != null) return false;
        return detail != null ? detail.equals(contact.detail) : contact.detail == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }
}
