package ua.edu.npu.lab02.task04;

public class Dog {
    int age;
    String name = "";
    static int counter = 0;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
        counter++;
        dogInfo();
    }

    public Dog(){
        name = "Unknown";
        age = 0;
        counter++;
        dogInfo();
    }

    private void voice () {
        for(int i=0; i<age; i++){
            System.out.print("Woof ");
        }
        System.out.println("");
    }

    private void dogInfo () {
        System.out.println("Name: " + name + ", Age: " + age);
        voice();
    }

    public static void dogsCreated() {
        System.out.println("Dogs created: " + counter);
    }
}
