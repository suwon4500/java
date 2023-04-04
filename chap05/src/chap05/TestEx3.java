/**
 * 1~1000까지 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for사용
 */

package chap05;

import java.util.Scanner;

public class TestEx3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("수 입력");
        int inputNum=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= 1000; i++) {
            if (i%inputNum==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
