package ua.artcode.week3.fin;

public class IPhone {

    private final int screenSize;
    private final int ram;
    private final int flashMemory;
    private final String model;

    public IPhone() {
        this(6, 2, 16, "5s");
    }

    public IPhone(int screenSize, int ram, int flashMemory, String model) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.flashMemory = flashMemory;
        this.model = model;
    }



    public void start(){
        System.out.println("Start IPhone");
    }
}
