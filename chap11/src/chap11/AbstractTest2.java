package chap11;

abstract class Figure {
    abstract void draw();
}

class Triangle2 extends Figure{
    public void draw(){
        System.out.println("다형성 - 삼각형");
    }
}

class Rectangle2 extends Figure{
    public void draw(){
        System.out.println("다형성-사각형");
    }
}

class Oval2 extends Figure{
    public void draw(){
        System.out.println("다형성-타원형");
    }
}

class Polydraw{
    public void pdraw(Figure f){
        f.draw();//이렇게 abstruct 다형성 선언을 하면 한줄컷 가능
        //무슨 값을 집어넣던지 지가 알아서 인식해서 경우에 따라 출력함
    }
}

public class AbstractTest2 {
    public static void main(String[] args) {
        Polydraw p = new Polydraw();//이건 출력용 클래스, 각 Figure객체를 입력받아 출력함

        Figure fg1 = new Triangle2();//추상화 객체선언 개꿀
        Figure fg2 = new Rectangle2();
        Figure fg3 = new Oval2();
        p.pdraw(fg1);
        p.pdraw(fg2);
        p.pdraw(fg3);
    }
}
