/**
 * 2023.04.04 채수원
 * 1~100까지의 숫자 중에서 사용자로부터 입력받은 숫자의 배수의 합을 구해라.
 */
package chap05;

import java.util.Scanner;
//10 20 30 40 50 60 70 80 90 100
public class ContinueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int total=0;
        int i=1;
        while (true){
            if (inputNum*i>100){
                break;
            }
            total+=inputNum*i;
            i++;
        }
        System.out.println(total);
    }
}
