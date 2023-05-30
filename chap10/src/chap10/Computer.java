package chap10;

public class Computer extends Calculator {
    double areaCircle(double r) {//재정의
        System.out.println("Executing areacircle of the calculator object");
        return Math.PI * r * r;
    }
}
