package chap09.exam04;

public class B {
    public B(){
        A a= new A();
        a.field1=1;
        a.field2=1;
        //a.field3=1;//private라서 안됨

        a.method1();
        a.method2();
        a.method3();
    }
}
