/**
 * 2023.03.14
 * 세 개의 값을 입력, 첫 번째 문장, 두 번쨰 정수, 세 번쨰 실수로
 * 202095093 채수원
 */
package chap02;

import java.util.Scanner;
public class keyboardInput {

    public static void main(String[] args) {
        java.util.Scanner stdin = new Scanner(System.in);
        System.out.print("이름, 나이, 몸무게 space로 구분하여 입력:");
        String name = stdin.next();
        int i = stdin.nextInt();
        double d = stdin.nextDouble();
        System.out.println(name+"의 나이는 "+i+"세 ");
        System.out.println("몸무게는"+d+"KG");

    }

}