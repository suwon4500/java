package chap08;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        //객체 생성

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("현재속도: " + myCar.speed);
        //필드값 읽기

        myCar.speed=100;
        System.out.println("수정된속도: " + myCar.speed);

    }
}
