package ua.artcode.workerProject.test;

import ua.artcode.workerProject.model.*;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder(1, "Vania", 3000, "456789", "java");
        coder.code();

        Worker worker = new Worker();

        Worker some = new Coder();

        Tester tester = new Tester(2, "Sanya", 2000, "5678", "lava");

        startWork(new Worker());
        startWork(new Coder());
    }

    public static void startWork(Worker worker){
        if (worker instanceof Coder){
            Coder coderRef = (Coder) worker;
            coderRef.code();
        } else if (worker.getClass() == Tester.class){
            Tester testerRef = (Tester) worker;
            testerRef.test();
        } else{
            worker.work();
        }
    }

}
