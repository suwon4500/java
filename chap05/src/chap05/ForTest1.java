/**
 * 2023-04-04
 * 채수원
 * 입력받은 숫자의 약수를 모두 출력
 * 문제분석
 * 변수: num, i
 * 알고리즘
 * 1.약수를 구할 숫장 입력 num
 * 2.복합논리
 * for(int i=1;i<=num;i++)
 */

package chap05;

import java.util.Scanner;

public class ForTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.print(i);
            }
        }
    }
}
