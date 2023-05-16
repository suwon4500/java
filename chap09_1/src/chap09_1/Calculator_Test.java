package chap09_1;

public class Calculator_Test {
    public static void main(String[] args) {
        double result=10*10*Calculator.pi;
        int result2=Calculator.plus(10,5);
        int result3=Calculator.minus(10,5);

        System.out.printf("result1=%f\nreuslt2=%d\nresult3=%d", result, result2,result3);
    }
}
