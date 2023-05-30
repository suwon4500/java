
package chap11;

class Rectangle4{
    public int width;
    public int height;
    public Rectangle4(int w, int h){
        width=w;
        height=h;
    }

    public int computerRectangleArea(){
        return width*height;
    }
}

class Cube4 extends Rectangle4 {
    public int depth;
    public Cube4(int w, int h, int d){
        super(w,h);
        depth=d;
    }
    public int computeCubeArea(){
        return super.computerRectangleArea()*depth;
    }
}

public class CastTest1 {
    public static void main(String[] args) {
        Rectangle4 r = new Cube4(10,20,30);

        System.out.println("r은 Rectangle4의 객체?"+(r instanceof Rectangle4));
        System.out.println("r은 Cube4의 객체?"+(r instanceof Cube4));
        System.out.println("r은 Object의 객체?"+(r instanceof Object));
        //상위 클래스 형의 객체변수를 통해 상위 클래스 메소드 호출
        System.out.println("넓이는 : "+r.computerRectangleArea());
        //하위 클래스 메소드 호출불가
        //System.out.println("넓이는 : "+r.computerCubeArea());
        //하위클래스 형의 객체변수에 상위 클래스로부터 생성된 객체 배정은 불가능
        //Cube4 c = new Rectangle4(10,20);

        Cube4 c=(Cube4) r; // r을 하위클래스 객체로 강제 형 변환
        System.out.println("크기는 : "+c.computeCubeArea());
    }

}