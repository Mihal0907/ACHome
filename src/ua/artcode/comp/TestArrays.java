package ua.artcode.comp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] mas = {2, 3, 7, 9, 0, 1, 9, 1, 1, 12, 10, 0, 17, 25};

        int[] cloned = Arrays.copyOf(mas, mas.length);

        int[] rangeMas = Arrays.copyOfRange(mas, 1, 3);

        Arrays.equals(mas, cloned);

        String strMas = Arrays.toString(mas);

        Arrays.fill(rangeMas, 2);

        Arrays.sort(mas);

        Cat[] cats = new Cat[5];

       cats[0] = new Cat("Vaska", 6.9, 3);
       cats[1] = new Cat("Murzik", 6.1, 6);
       cats[2] = new Cat("Razikk", 7.9, 4);
       cats[3] = new Cat("Cot", 4.2, 2);
       cats[4] = new Cat("Benya", 7.1, 4);

       Arrays.sort(cats);
       String res = Arrays.toString(cats);
       res = res.replaceAll("\\}", "\\}\n");

        System.out.println(res);
    }
}

class Cat implements Comparable{

    private  String petName;
    private  double weight;
    private  int age;

    public Cat(String petName, double weight, int age) {
        this.petName = petName;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;
        return this.age > other.age ? 1 : this.age < other.age ? -1 : 0;
    }
}
