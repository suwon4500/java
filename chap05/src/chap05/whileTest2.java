package chap05;

import java.util.Scanner;

/**
 * 2023-04-04
 * 채수원
 * 입력받은 숫자 팩토리얼 구하기
 * 문제분석
 * 변수 - fac, facvalue
 * 알고리즘
 * 1.팩토리얼 구할 수 입력
 * 2.반복
 * while(fac>1)
 * fac--;
 * facvalue=fac-1;
 * 3.
 */
public class whileTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input num : ");
        int fac=scanner.nextInt();
        int facvalue = 1;
        while (fac>1){
            System.out.print(fac+"*");
            facvalue=facvalue*(fac--);

        }
        System.out.print("1="+facvalue);
    }
}
