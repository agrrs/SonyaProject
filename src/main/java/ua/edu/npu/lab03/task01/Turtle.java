package ua.edu.npu.lab03.task01;

public class Turtle extends Pet implements Swimming, Walking {
    public void walk() {
        System.out.println("Turtle walks");
    }

    public void swim() {
        System.out.println("Turtle swim");
    }

    public String petType() {
        return "Turtle";
    }

    public Turtle (String owner, String name, int age) {
        super(owner, name, age);
    }
}
