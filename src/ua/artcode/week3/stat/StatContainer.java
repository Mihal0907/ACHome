package ua.artcode.week3.stat;

public class StatContainer {
    private int val;

    public static int count = 10;

    static {
        //while loading class
        System.out.println("static block");
    }

    public static int random(){
        return (int)(Math.random() * 100);
    }

    public void testNonStatic(){

    }

}
