package chap11;
/*
자동 형변환
클래스의 현변환은 상속관계에서 발생
자식은 부모 타입으로 자동타입 변환 가능
바로 위 부모가 아니더라도 상속 계층에 포함되어있으면 가능
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //상위 클래스 객체 변수에 하위 클래스 클래스에서 생성된 객체 배정허용
        A a1=b;
        A a2=c;
        A a3=d;
        A a4=e;

        B b1=d;
        C c1=e;
        //상속 아니라서 불가능
        //B b3=e;
        //C c2=d;
    }
}
