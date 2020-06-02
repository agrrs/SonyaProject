package ua.edu.npu.lab01.task08;

public class Split {
    String[] stringArray;
    public void split(String s) {
        stringArray = s.split(" ");
    }

    public String[] getStringArray() {
        return stringArray;
    }
}
