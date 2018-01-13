package ua.artcode.studentProject.model;

public class Address {

    private String city;
    private String street;
    private String houseNum;

    public Address(String city, String street, String houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNum() {
        return houseNum;
    }
}
