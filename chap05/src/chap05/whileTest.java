/**
 * 2023.03.28
 * 채수원
 * 반복문 1~10 합계 구하기
 */

package chap05;

public class whileTest {
    public static void main(String[] args) {
        int sum=0, cnt=1;
        while (cnt<=10){
            sum+=cnt;
            cnt++;
        }
        System.out.println("1~10 total:"+sum);
        sum=0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.print(sum);

        sum=0;
        cnt=0;
        do{
            sum+=cnt;
            cnt++;
        }while (cnt<=10);

        System.out.print(sum);
    }
}
