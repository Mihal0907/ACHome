package ua.artcode.workerProject.controller;

import ua.artcode.workerProject.model.Worker;

public class COmpanyController {
    public static void startWork(Worker worker){
        worker.work();
    }
}
