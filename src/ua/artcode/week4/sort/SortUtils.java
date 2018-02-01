package ua.artcode.week4.sort;

public class SortUtils {

    public static void selectionSort(int[] mas){
        if (mas == null || mas.length == 0){
            return;
        }
        for (int j = 0; j < mas.length; j++) {
            int minI = 0;
            for (int i = j + 1; i < mas.length; i++) {
                if (mas[minI] > mas[i]){
                    minI = i;
                }
            }
            swap(mas,j, minI);
        }
    }

    public static void swap (int[] mas, int i, int j){
        int buf = mas[i];
        mas[i] = mas[j];
        mas[j] = buf;
    }

}
