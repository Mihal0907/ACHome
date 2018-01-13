package ua.artcode.week1day1.test;
import ua.artcode.week1day1.model.*;

public class TestStudent {

    public static void main(String[] args) {

        //create instance
        //allocate memory for student
		MyData myData1 = new MyData(9, 7, 1998);
	    Student student1 = new Student("Andrey", "0636523257", "miandmih@gmail.com", myData1,
				2000.00,"Bucha", "SomeStreet", "56");


        System.out.println(student1.convertStudent());
    }

}
