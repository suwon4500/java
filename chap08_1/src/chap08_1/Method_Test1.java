/*
메소드 이름은 자바 식별자 규칙에 맞게
관례적으로 소문자로 작성
$, _ 제외한 특수문자 사용금지
매개변수-메소드가 실행할 때 필요한 데이터를 외부에서 받기 우해 사용
(1)매개변수의 개수를 알 수 있는 경우
(2)매개변수의 개수를 모를경우 - 배열 타입으로 선언
 */

package chap08_1;

class Cal{
    void poweron(){
        System.out.println("파워온");
    }
    int plus(int x, int y){
        return x+y;
    }

    double divide(int x, int y){
        return (double)x/(double)y;
    }

    void poweroff(){
        System.out.println("시동꺼짐");
    }

    //매개변수 개수 모를때 배열타입으로 선언
    int sum1(int[] values){
        int sum=0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
    
    int sum2(int... values){
        int sum=0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
    
}
public class Method_Test1 {
    public static void main(String[] args) {
        Cal myCalc = new Cal();
        myCalc.poweron();

        int result1=myCalc.plus(5,6);
        System.out.println("result1:"+result1);

        byte x=10;
        byte y=4;
        double result2=myCalc.divide(x,y);
        System.out.println("result2:"+result2);

        int[] values1={1,2,3};
        int result3=myCalc.sum1(values1);
        System.out.println("result3:"+result3);

        int result4=myCalc.sum2(new int[] {1,2,3,4,5});
        System.out.println("result4:"+result4);

        int result5=myCalc.sum2(1,2,3);
        System.out.println("result5:"+result5);

        myCalc.poweroff();
    }

}
