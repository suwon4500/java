/**
 * 채수원
 * 4월11일
 * 배열 초기화하고 출력해보기
 */
package chap06;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum=0.0, avg;
        double dnum[]=new double[5]; //배열 선언
        System.out.printf("dnum의 배열 길이: %d\n", dnum.length);//배열길이
        System.out.print("초기화 하지 않은 dnum[]의 값 : ");

        for (int i = 0; i < dnum.length; i++) {
            System.out.print(dnum[i] + " ");//dnum[]의 묵시적 값 출력
        }
        System.out.println();

        for (int i = 0; i < dnum.length; i++) {
            System.out.printf("dnum[%d]번째 데이터 입력", i);
        }

        for (int i = 0; i < dnum.length; i++) {
            sum+=dnum[i]; //dnum의 요소값들 더하기
        }

        System.out.println("배열의 합은 "+sum+"입니다.");
        avg=sum/dnum.length;
        System.out.print(avg);
    }
}