package chap08_1;

public class Calcultaion_Test {
    public static void main(String[] args) {
        Calculation myClac=new Calculation();//외부 클래스에서 메소드 참조 시 반드시 객체를 생성.
        myClac.execute();
    }
}
