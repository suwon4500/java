package chap09_1;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("1234-5678", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation="japan";//파이널이라서 불가능
        p1.name="채수원";//파이널 아니라서 사용가능
        //p1.ssn="777-7777";//생성자로 final 생성했기 때문에 변경불가
    }
}
