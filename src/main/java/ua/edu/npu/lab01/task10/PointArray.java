package ua.edu.npu.lab01.task10;

public class PointArray {
    protected Point[] pointArray;

    public PointArray(int n) {
        pointArray = new Point[n];
        for (int i = 0; i < n; ++i) {
            pointArray[i] = new Point();
        }
    }
}
