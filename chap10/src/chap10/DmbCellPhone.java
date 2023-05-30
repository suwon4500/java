package chap10;
//여러개의 부모클래스 상속안됨. private권한을 갖는 놈은 상속불가
public class DmbCellPhone extends CellPhone {
    int channel;
    DmbCellPhone(String model, String color, int channel){
        this.model=model;
        this.color=color;
        this.channel=channel;
    }

    //메서드
    void turnOnDmb(){
        System.out.println("채널"+channel+"DMB가 수신시작");
    }
    
    void changeChannelDmb(int channel){
        this.channel=channel;
        System.out.println("채널"+channel+"변경.");
    }
    
    void turnOffDmb(){
        System.out.println("방송수신종료");
    }
    
}
