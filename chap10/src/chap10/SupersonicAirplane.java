package chap10;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("supersonic flight.");
        }
        else {
            super.fly(); //Airplane 객체의 fly() 메소드 호출
        }
    }

}