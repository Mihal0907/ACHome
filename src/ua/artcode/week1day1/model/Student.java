package ua.artcode.week1day1.model;

public class Student {

    public String name;
    public String phone;
    public String email;

    public int birthYear;
    public int birthMonth;
    public int birthDay;

    public double paidMoney;

    public String city;
    public String street;
    public String houseNum;

    public int taskCount;

    public String convertStudent(){

        return String.format(" Name is: %s \n He(She) was born: %d:%d:%d \n His(Her) email is: %s \n Address: %s, %s, %s",
                name, birthDay, birthMonth, birthYear, email, city, street, houseNum);
    }

    public void init(String name, int birthDay, int birthMonth, int birthYear,
                     String email, String city, String street, String houseNum) {
       this.name = name;
       this.birthDay = birthDay;
       this.birthMonth = birthMonth;
       this.birthYear = birthYear;
       this.email = email;
       this.city = city;
       this.street = street;
       this.houseNum = houseNum;
    }
}
