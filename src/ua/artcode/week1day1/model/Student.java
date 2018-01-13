package ua.artcode.week1day1.model;

public class Student {

    public String name;
    public String phone;
    public String email;

    public MyData myData;

    public double paidMoney;

    public String city;
    public String street;
    public String houseNum;

    public int taskCount;

    public Student(String name, String phone, String email, MyData myData, double paidMoney, String city, String street, String houseNum) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.myData = myData;
        this.paidMoney = paidMoney;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String convertStudent(){

        return String.format(" Name is: %s \n He(She) was born: %d:%d:%d \n His(Her) email is: %s \n Address: %s, %s, %s",
                name, myData.birthDay, myData.birthMonth, myData.birthYear, email, city, street, houseNum);
    }

}
