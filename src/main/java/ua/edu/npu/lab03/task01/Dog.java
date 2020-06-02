package ua.edu.npu.lab03.task01;

public class Dog extends Pet implements Talking, Walking {
    public void talk() {
        for (int i=0; i<age; i++) {
            System.out.println("Woof ");
        }
    }

    public void walk() {
        System.out.println("Dog walks");
    }

    public String petType() {
        return "Dog";
    }
    public Dog(String owner, String name, int age){
        super(owner, name, age);
    }
}
