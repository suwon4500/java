package chap09.exam05;

import chap09.exam04.A;

public class C {
    public C(){
        A a= new A();
        a.field1=1;
        //a.field2=1;//타 패키지라서 안됨
        //a.field3=1;//private라서 안됨

        a.method1();
        //a.method2(); 타 패키지임
        //a.method3(); private임
    }
}
