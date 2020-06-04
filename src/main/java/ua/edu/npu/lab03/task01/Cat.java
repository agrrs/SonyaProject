package ua.edu.npu.lab03.task01;

public class Cat extends Pet implements Talking, Walking {
    public void walk() {
        System.out.println("Cat walks");
    }

    public void talk() {
        System.out.println("Meow");
    }

    public String petType() {
        return "Cat";
    }

    public Cat (String owner, String name, int age) {
        super(owner, name, age);
    }
}
