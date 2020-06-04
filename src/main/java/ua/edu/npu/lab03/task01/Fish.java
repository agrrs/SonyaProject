package ua.edu.npu.lab03.task01;

public class Fish extends Pet implements Swimming {
    public void swim() {
        System.out.println("Fish swim");
    }

    public String petType() {
        return "Fish";
    }

    public Fish(String owner, String name, int age) {
        super(owner, name, age);
    }
}
