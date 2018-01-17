package ua.artcode.studentProject.model;

public class MyGroup {

    private static final int DEFAULT_GROUP_SIZE = 15;
    private Student[] studentList;
    private String name;
    private int size;

    public MyGroup(String name) {
        this.name = name;
        studentList = new Student[DEFAULT_GROUP_SIZE];
    }

    public MyGroup(String name, int placeCount) {
        studentList = new Student[placeCount];
        this.name = name;
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        if (size == studentList.length) {
            return false;
        }

        studentList[size++] = student;

        return true;
    }


    public void showAll() {
    }

    public void get() {
    }

    public void search() {
    }

    public void remove() {
    }
}
