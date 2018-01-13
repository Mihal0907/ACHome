package ua.artcode.studentProject.model;

public class Student {

    private String name;
    private String phone;
    private String email;

    private MyData myData;
    private Address address;

    private double paidMoney;


    public Student(String name, String phone, String email, MyData myData, double paidMoney, Address address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.myData = myData;
        this.paidMoney = paidMoney;
        this.address = address;
    }

    public String convertStudent() {

        return String.format(" Name is: %s \n He(She) was born: %d:%d:%d \n His(Her) email is: %s\n" +
                        " Phone number is: %s\n Address: %s, %s, %s\n He(She) have %s $ per month\n\n",
                name, myData.getBirthDay(), myData.getBirthMonth(), myData.getBirthYear(), email, phone,
                address.getCity(), address.getStreet(), address.getHouseNum(), paidMoney);
    }
}
