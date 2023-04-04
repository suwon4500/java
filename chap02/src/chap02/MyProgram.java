package chap02;

import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args){
        /*
        double r =5.0;
        double pi = 3.14159;

        System.out.printf("반지름이 %f인 원의 넓이는 %f입니다.\n", r, pi*r*r);
        System.out.printf("반지름이 %e인 원의 넓이는 %e입니다.\n", r, pi*r*r);

        Scanner stdin = new Scanner(System.in); //Scanner 객체 생성 stdin
        System.out.print("이름과 나이, 몸무게를 공간(space)로 구분하여 입력:");
        String name = stdin.next();
        int i = stdin.nextInt();
        double d = stdin.nextDouble();
        System.out.print(name + "씨의 나이는" + i + "세이고\n몸무게는 " + d + "kg 입니다.");
         */ //Scanner 연습
        /*
        double a = (double)2;
        System.out.print(a);
        System.out.printf(" %.2f", a);
         */ //소수점 아래 서식문자 연습
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("한개의 숫자를 입력 : ");
        int a = scanner.nextInt();
        boolean flag;
        flag = (a%2==0) ? true : false;
        System.out.print(a + "가 짝수입니까? : ");
        System.out.println(flag);
         */ // 3항 연산자 활용 연습
        /*
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        System.out.println(grade>=90 ? "A학점 취득 성공" : "실패 ㅋㅋ");
         */ // 3항 연산자 활용 연습 2
        /*
        char c ='A';
        switch (c){
            case 'A':
            case 'B':
                System.out.println("성적 좋네");
            case 'C':
            case 'D':
                System.out.println("보통이네");
         */ // switch case 문 연습
        /*
        int sum=0;
        for (int i=1; i<=10; i++)
            sum+=i;
        System.out.println(sum);

        int a=0, b=0;
        for (a=1, b=10; a<b; a++,b--){
            System.out.println(a + b);
        }

         */ // for 유연하게 사용 연습



    }
}
