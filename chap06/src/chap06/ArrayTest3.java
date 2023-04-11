/**
 * 4월11일
 * 1차원 배열에서 입력받은 값 검색하기 (선형검색)
 */

package chap06;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        int inum[]={8,7,3,6,8,7,0,4,1,2};
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number:");
        int key = scanner.nextInt();
        int count=0;

        for (int i=0; i<inum.length; i++){
            if (inum[i]==key){
                count++;
                System.out.println((i+1) + "번째 데이터와 동일합니다");
            }
        }
        if (count==0)
            System.out.println(key + "값은 배열에 없음 ㅋ");
        else
            System.out.println(key+"값은 배열에 "+count+" 개 만큼 있다.");
    }
}
