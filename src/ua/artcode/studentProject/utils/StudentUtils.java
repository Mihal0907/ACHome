package ua.artcode.studentProject.utils;

import ua.artcode.studentProject.model.Address;
import ua.artcode.studentProject.model.MyData;
import ua.artcode.studentProject.model.Student;

public class StudentUtils {

    public static Student generateStudent(){

        String name = generateName();
        String phone = generatePhone();
        String email = generateMail(name);
        MyData myData = generateDate();
        Address address = generateAddress();
        double paidMoney = generateMoney();

        return new Student(name, phone, email, myData, paidMoney, address);
    }

    private static double generateMoney() {
        return generateNum(500, 4000);
    }

    private static Address generateAddress() {
        return new Address("Kiev", "Polytechnic", String.valueOf(generateNum(0, 100)));
    }

    private static MyData generateDate() {
        return new MyData(generateNum(1, 32), generateNum(1, 13), generateNum(1970, 2000));
    }

    private static int generateNum(int left, int right) {
        return left + (int)(Math.random() * (right - left));
    }

    private static String generateMail(String name) {
        return name.toLowerCase() + "@gmail.com";
    }

    private static String generatePhone() {
        String phone = "+380";
        for (int i = 0; i < 9; i++) {
            phone += (int)(Math.random() * 10);
        }
        return phone;
    }

    private static String generateName() {
        String[] names = {"Andrey", "Ivan", "Vova", "Sasha", "Yura", "Serhii", "Oleg", "Slava",
                        "Katya", "Olga", "Nastya", "Vika", "Sonya"};

        return names[(int)(Math.random() * names.length)];
    }

}
