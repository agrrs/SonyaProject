package ua.edu.npu.lab03.task01;

public class Eagle extends Pet implements Flying, Walking, Talking {
    public void walk() {
        System.out.println("Eagle walks");
    }

    public void talk() {
        System.out.println("Screech");
    }

    public void fly() {
        System.out.println("Eagle fly");
    }

    public String petType() {
        return "Eagle";
    }

    public Eagle (String owner, String name, int age) {
        super(owner, name, age);
    }
}
