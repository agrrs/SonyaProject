package ua.edu.npu.lab04.task04;

public class Application {
    public static void main(String[] args) {
    ArrayStack arrayStack = new ArrayStack(3);
        System.out.println(arrayStack.pop());
        arrayStack.push(93);
        arrayStack.push(67);
        arrayStack.push(13);
        arrayStack.push(74);
        System.out.println("Popped " + arrayStack.pop());
        System.out.println("Stack size is " + arrayStack.getSize());
        arrayStack.clear();
        System.out.println(arrayStack.pop());
    }
}
