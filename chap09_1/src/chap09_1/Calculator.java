//정적멤버 이용 static
package chap09_1;

public class Calculator {
    static double pi=3.14159;
    int field1;

    /*
    static void Method(){
        this.field1=10;
    }
    */
    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }

}
