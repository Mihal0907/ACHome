package ua.artcode.studentProject.model;

public class MyData {

    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public MyData(int birthDay, int birthMonth, int birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }
}
