package ua.artcode.interf;

public class WorldExample {
    public static void main(String[] args) {

        Company company = new Company();
        University university = new University();

        Employee employee = new Employee();
        Student student = new Student();

        SuperPerson superPerson = new SuperPerson();

        company.visit(employee);
        company.visit(superPerson);
        university.visit(student);
        university.visit(superPerson);
    }

}

class Company {
    void visit(IEmployee empl) {
        empl.work();
    }
}

class University {
    void visit(IStudent student) {
        student.study();
    }
}


class SuperPerson implements IEmployee, IStudent {

    @Override
    public void study() {
        System.out.println("SP study");
    }

    @Override
    public void work() {
        System.out.println("SP work");
    }
}

interface IStudent {
    void study();
}

class Student implements IStudent {

    public void study() {
        System.out.println("Study");
    }

}

interface IEmployee {
    void work();
}

class Employee implements IEmployee {
    public void work() {
        System.out.println("Work");
    }
}
