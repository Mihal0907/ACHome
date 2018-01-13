package ua.artcode.week1day1.test;
import ua.artcode.week1day1.model.*;
import ua.artcode.week1day1.utils.*;

public class TestStudent {

    public static void main(String[] args) {

        //create instance
        //allocate memory for student
	    Student student1 = new Student();

	    student1.init("Andrey", 9, 7, 1998, "miandmih@gmail.com",
				"Bucha", "SomeStreet", "56");
        System.out.println(student1.convertStudent());
    }

}
