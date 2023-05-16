package chap09.exam04;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A(){
        field1=1;//가능
        field2=1;//가능
        field3=1;//가능

        method1();//가능
        method2();//가능
        method3();//가능 동일 클래스 내에서 접근가능

    }

    public void method1(){};
    public void method2(){};
    public void method3(){};

}
