package ua.artcode.week6.io;

import java.io.FileNotFoundException;

public class TestFileReading {
    public static void main(String[] args) throws FileNotFoundException {
        String res = IOUtils.readFileContent("C:\\Users\\Andrey\\IdeaProjects\\ACHome\\src\\example.txt");

        System.out.println(res);
    }
}
