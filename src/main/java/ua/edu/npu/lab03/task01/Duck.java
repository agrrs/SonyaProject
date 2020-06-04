package ua.edu.npu.lab03.task01;

public class Duck extends Pet implements  Flying, Swimming, Walking, Talking{
    public void walk() {
        System.out.println("Duck walks");
    }

    public void talk() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("Duck fly");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public String petType() {
        return "Duck";
    }

    public Duck (String owner, String name, int age) {
        super(owner, name, age);
    }
}
