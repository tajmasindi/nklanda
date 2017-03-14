package com.bbd;

public class HomeStead {
    private String name;
    private String district;
    private String province;
    private String country;

    public HomeStead(String n, String d, String p, String c) {
        name = n;
        district = d;
        province = p;
        country = c;
    }

    public String toString() {
        return "";
    }

    public void setName(String n) {
        name = n;
    }

    public void setDistrict(String d) {
        district = d;
    }

    public void setProvince(String p) {
        province = p;
    }

    public void setCountry(String c) {
        country = c;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }
}