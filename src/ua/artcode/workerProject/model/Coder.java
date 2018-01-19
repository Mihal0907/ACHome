package ua.artcode.workerProject.model;

public class Coder extends Worker {

    private String programmingLenguage;

    public Coder(){
        super();
        System.out.println("Coder constructor");
    }

    public Coder(int id, String name, double salary,
                 String phone, String programmingLenguage){
        super();
        this.programmingLenguage = programmingLenguage;

    }

    public String getProgrammingLenguage() {
        return programmingLenguage;
    }

    public void setProgrammingLenguage(String programmingLenguage) {
        this.programmingLenguage = programmingLenguage;
    }

    public void code(){
        System.out.println("coder code");
    }

}
