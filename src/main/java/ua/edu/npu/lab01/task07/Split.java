package ua.edu.npu.lab01.task07;

public class Split {
    String[] stringArray;
    public void Split (String s) {
        stringArray = s.split(" ");
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void output (String[] arr) {
        for (String a : arr)
            System.out.print(a + " ");
    }
}
