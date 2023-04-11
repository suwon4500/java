package chap06;

import java.util.Arrays;

/**
 * 채수원
 * 4월11일
 * 배열 최댓값 찾기
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        int score[]={88,97,53,62,92,68,82};
        int max=score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i]>max)
                max=score[i];
        }
        System.out.println("최댓값 : " + max);
        System.out.println(Arrays.stream(score).max().getAsInt());
    }
}
