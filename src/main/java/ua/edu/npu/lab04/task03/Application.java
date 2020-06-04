package ua.edu.npu.lab04.task03;

public class Application {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.pop();
        arrayStack.push(94);
        arrayStack.push(45);
        arrayStack.push(31);
        arrayStack.push(19);
        arrayStack.push(76);
        System.out.println("Stack length^ " + arrayStack.getSize());
        System.out.println("Popped " + arrayStack.pop());
        System.out.println("Popped " + arrayStack.pop());
        System.out.println("Popped " + arrayStack.pop());
        System.out.println("Popped " + arrayStack.pop());
        System.out.println("Stack length: " + arrayStack.getSize());
        arrayStack.push(138);
        arrayStack.clear();
        System.out.println("Stack length: " + arrayStack.getSize());
    }
}
