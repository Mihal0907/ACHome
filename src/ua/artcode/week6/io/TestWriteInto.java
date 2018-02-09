package ua.artcode.week6.io;

import java.util.Arrays;

public class TestWriteInto {
    public static void main(String[] args) {
        IOUtils.writeIntoFile2(Arrays.asList("line1", "line2" ,"line3", "line4"),
                "C:\\Users\\Andrey\\IdeaProjects\\ACHome\\src\\example2.txt");
    }
}
