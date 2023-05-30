package chap10;

public class CellPhone 
{
    //필드
    String model;
    String color;

    //생성자

    //메소드

    void poweron() {
        System.out.println("power on.");
    }

    void poweroff() {
        System.out.println("power off.");
    }

    void bell() {
        System.out.println("ring bell.");
    }

    void sendVoice(String message) {
        System.out.println("me:"+message);
    }

    void receiVoice(String message) {
        System.out.println("you:"+message);
    }

    void hangUp() {
        System.out.println("end call.");
    }


}
