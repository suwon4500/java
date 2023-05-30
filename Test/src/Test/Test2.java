/*
 * add,sub,mul,div 클래스 생성
 * 각 클래스의 공통 필드 매소드
 * int a,b :2개의 피 연산자
 * void setValud(int a,int b):피연산자 값 객체 내에 저장
 * int calculate():클래스 목적에 맞는 연산 실행 후 결과 return
 * main()메소드
 * add,sub,mul,div객체 생성
 * setValud,calculate()호출 후 결과 출력
 * 실행결과
 * 두 정수 연산자 입력 >> 5 7 *
 * 35
 */
package Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class Calculator{
    public abstract int add(int a[]);
    public abstract int subtract(int a[]);
    public abstract double average(int a[]);
    public abstract int mul(int a[]);
    public abstract double div(int a[]);
}
class Cal2 extends Calculator{
    @Override
    public int add(int a[]){
        return a[0]+a[1];
    }
    @Override
    public int subtract(int a[]){
        return a[0]-a[1];
    }
    @Override
    public double average(int a[]){
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return (sum/a.length);
    }
    public int mul(int a[]){
        return a[0]*a[1];
    }
    public double div(int a[]){
        return a[0]/a[1];
    }
}
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Cal2 cal = new Cal2();
        int arr[] = new int[2];
        System.out.println("두 정수 입력");
        arr[0]=scanner.nextInt();
        arr[1]=scanner.nextInt();
        System.out.println(cal.add(arr));
        System.out.println(cal.subtract(arr));
        System.out.println(cal.average(arr));
        System.out.println(cal.mul(arr));
        System.out.println(cal.div(arr));
    }
}
