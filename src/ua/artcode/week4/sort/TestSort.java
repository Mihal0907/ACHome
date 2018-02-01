package ua.artcode.week4.sort;

import ua.artcode.week4.utils.ITimeAction;
import ua.artcode.week4.utils.TimeCounter;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] mas = new int[100000];

        Arrays.stream(mas).map((e) -> (int)(Math.random() * 1000)).toArray();

        long res = TimeCounter.count(new BubblTimeAction(mas));

        ITimeAction iTimeAction = () -> Arrays.sort(mas);


        long arraysSort = TimeCounter.count(iTimeAction);

        System.out.println(res);
    }
}

class BubblTimeAction implements ITimeAction {

    private int[] mas;

    public BubblTimeAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(mas);
    }
}
