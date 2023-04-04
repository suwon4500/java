//두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더해서 출력하기
/**
 * 변수 - num1, num2, sum
 * 알고리즘
 * 1.두 정수 입력
 * 2. 선택문(if(num1<num2))
 * 3. 복합논리(반복문 안에 선택문 포함)
 *     while(num1<=num2)
 *     if(num1%2==1)
 */


package chap05;

import java.util.Scanner;

public class TestEx4 {
    public static int compareNum(int num1, int num2){

        return num1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum=0;
        for (int i = num1+1; i < num2; i++) {
            if (i%2==1)
                sum+=i;
        }
        System.out.println(sum);

    }
}
