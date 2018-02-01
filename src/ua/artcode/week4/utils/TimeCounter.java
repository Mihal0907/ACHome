package ua.artcode.week4.utils;

public class TimeCounter {

    public static long count(ITimeAction action){
        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }
}
