package ua.artcode.studentProject.test;

import ua.artcode.studentProject.model.*;
import ua.artcode.studentProject.utils.StudentUtils;

public class TestStudent {

    public static void main(String[] args) {

        //create instance
        //allocate memory for student
        Student[] studentsArr = new Student[10];
        for (int i = 0; i < studentsArr.length; i++) {
            studentsArr[i] = StudentUtils.generateStudent();
        }

        for (Student student : studentsArr) {
            System.out.println(student.convertStudent());
        }
    }

}
