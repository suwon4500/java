package chap05;

import java.util.Scanner;

/**
 * 2023-04-04
 * 채수원
 * 두 숫자 입력받아서 두 수 사이의 합계 출력
 * #문제분석
 * 변수 : first, second, total
 * #알고리즘
 * 1.정수입력
 * 2.선택문 if first<second
 */

public class TestEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 2개 입력 : ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int temp, total=0;

        if (first>second){
            temp=first;
            first=second;
            second=temp;
        }//first는 항상 작다

        while (first<=second){
            total+=first;
            first++;
        }
        System.out.print("total = " + total);

    }
}
