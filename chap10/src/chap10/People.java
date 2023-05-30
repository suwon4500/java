package chap10;
/*생성자는 호출안됨
모든 ㄴ객체는 클래스의 생성자를 호출해야지만 생성된다
상위클래스의 기본생성자가 먼저 호출됨
super()는 맨 첫줄에 작성하고 부모 클래스의 기본 생성자를 호출한다
super(매개값)   매개값과 타입이이 일치하는 부모생성자가 없으면 컴파일 에러
 */
public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn){
        this.name=name;
        this.ssn=ssn;
    }
}
