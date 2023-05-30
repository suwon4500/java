package chap11;

class Parent{
    public void method1(){
        System.out.println("Parent-method1");
    }

    public void method2(){
        System.out.println("Parent-method2");
    }
}

class Child extends Parent{
    @Override
    public void method2(){
        System.out.println("Parent-method2");
    }
    public void method3(){
        System.out.println("Parent-method3");
    }
}
public class CastingTest {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // 하위 클래스에서 생성한 객체를 배정 -> 자동타입변환(업캐스팅)
        parent.method1();
        parent.method2();//재정의된 놈
        //메소드3은 불가
    }
}
