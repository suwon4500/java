package chap09_1;

public class Car {
    int speed;
    
    void run(){
        System.out.println(speed+"로 달린다");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed=60;
        myCar.run();
    }
}
