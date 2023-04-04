/**
 * 2023-04-04
 * 채수원
 * 숫자를 반복적으로 입력받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */

package chap05;

import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num2;
        int total=0;
        while (true){
            int num = scanner.nextInt();
            total+=num;
            if(total>1000) {
                System.out.print("마지막 숫자: "+num+"\ntotal: "+total);
                num2=num;
                break;
            }
        }
    }
}
