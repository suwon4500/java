package chap10;

public class DmbPhoneExample {

    public static void main(String[] args) {
        // DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("javaphone", "black", 10);

        // cellPhone 클래스로부터 상속받은 필드
        System.out.println("model : " + dmbCellPhone.model);
        System.out.println("color : " + dmbCellPhone.color);

        // DmbCellPhone 클래스의 필드
        System.out.println("channel : " + dmbCellPhone.channel);

        // CellPhone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.poweron();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello");
        dmbCellPhone.receiVoice("Hello! I'm gildong!");
        dmbCellPhone.sendVoice("Nice to meet you");
        dmbCellPhone.hangUp();

        // dmbCellPhone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();


    }

}