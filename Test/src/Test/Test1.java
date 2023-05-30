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

import java.util.Scanner;

class Cal{
    int a, b;
    String c;
    void setValud(int a, int b, String c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    int calculate(){
        if(c.equals("+")){
            return a+b;
        } else if (c.equals("-")) {
            return a-b;
        } else if (c.equals("*")) {
            return a*b;
        } else if (c.equals("/")){
            return a/b;
        }
        return 0;
    }

    static class Add{
        int add(int a, int b){
            return a+b;
        }
    }

    static class Sub{
        int sub(int a, int b){
            return a-b;
        }
    }
    static class Mul{
        int mul(int a, int b){
            return a*b;
        }
    }
    static class Div{
        int div(int a, int b){
            return a/b;
        }
    }
}
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Cal cal = new Cal();
        Cal.Add add = new Cal.Add();
        Cal.Sub sub = new Cal.Sub();
        Cal.Div div = new Cal.Div();
        Cal.Mul mul = new Cal.Mul();
        System.out.println("두 정수 연산자 입력");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        String c=scanner.next();
        cal.setValud(a,b,c);
        System.out.println(cal.calculate());
    }
}