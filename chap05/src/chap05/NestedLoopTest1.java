/**
 * 2023.04.04
 * 채수원
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 */

package chap05;

import java.util.Scanner;

public class NestedLoopTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line=scanner.nextInt();
        for (int i = 0; i <= line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
