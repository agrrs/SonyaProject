package ua.edu.npu.lab02.task03;

public class Dog {
    int age;
    String name = "";

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog(){
        name = "Unknown";
        age = 0;
    }

    private void voice () {
        for(int i=0; i<age; i++){
            System.out.print("Woof ");
        }
        System.out.println("");
    }

    public void dogInfo () {
        System.out.println("Name: " + name + ", Age: " + age);
        voice();
    }
}
