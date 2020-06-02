package ua.edu.npu.lab01.task10;

public class Perimeter {
    double perimeter = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    public void getBiggerPerimeter(PointArray arr) {
        for(int i = 0; i<arr.pointArray.length; i++) {
            for(int j = i+1; j<arr.pointArray.length; j++) {
                for(int k = j+1; k<arr.pointArray.length; k++){
                    a = getLength(arr.pointArray[i].getX(), arr.pointArray[j].getX(), arr.pointArray[i].getY(), arr.pointArray[j].getY());
                    b = getLength(arr.pointArray[i].getX(), arr.pointArray[k].getX(), arr.pointArray[i].getY(), arr.pointArray[k].getY());
                    c = getLength(arr.pointArray[j].getX(), arr.pointArray[k].getX(), arr.pointArray[j].getY(), arr.pointArray[k].getY());
                    a *= 10;
                    a = Math.round(a);
                    a /= 10;
                    b *= 10;
                    b = Math.round(b);
                    b /= 10;
                    c *= 10;
                    c = Math.round(c);
                    c /= 10;
                    if((a+b+c) > perimeter) {
                        perimeter = a + b + c;
                    }
                }
            }
        }
    }

    public double getLength(int x1, int x2, int y1, int y2){
        double lengthPow = 0;
        double side;
        lengthPow = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        side = Math.sqrt(lengthPow);
        return side;
    }

    public void Output() {
        System.out.println("The biggest perimeter is " + a + "+" + b + "+" + c + "=" + perimeter);
    }
}
