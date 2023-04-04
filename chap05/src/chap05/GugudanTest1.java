/**
 * 2023.03.28
 * 채수원
 * 입력받은 단의 구구단 출력하기
 */
package chap05;

import java.util.Scanner;

public class GugudanTest1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("단을 입력하라 아쎄이 : ");
        int dan = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }


    }
}
