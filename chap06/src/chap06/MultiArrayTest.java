/**
 * 04월 11일
 * 2차언 배열의 값은 난수로 초기화
 * 2차원 배열의 각 행의 합계 출력
 */
package chap06;

import java.util.Random;

public class MultiArrayTest {
    public static void main(String[] args) {
        Random random = new Random();
        int score[][]= new int[4][4];

        for (int i = 0; i < 4; i++) {//행
            for (int j = 0; j < 4; j++) {//열
                score[i][j]=random.nextInt(10);//0~9까지 난수 발생
                System.out.print(score[i][j]+ " ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int value:score[i]) {
                System.out.print(value+" ");
                sum+=value;
            }
            System.out.println("sum is "+sum);
        }
    }
}
