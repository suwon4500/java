package chap08;

public class Car1Test {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        System.out.println("car1.company:"+car1.company);
        System.out.println();

        Car1 car2 = new Car1("M340i");
        System.out.println("car2.company:"+car2.company);
        System.out.println("car2.모델:"+car2.model);
        System.out.println();

        Car1 car3 = new Car1("M340i", "빨강");
        System.out.println("car3.company:"+car3.company);
        System.out.println("car3.모델:"+car3.model);
        System.out.println("car3.색상:"+car3.color);
        System.out.println();

        Car1 car4 = new Car1("M340i", "빨강", 340);
        System.out.println("car4.company:"+car3.company);
        System.out.println("car4.모델:"+car3.model);
        System.out.println("car4.색상:"+car3.color);
        System.out.println("car4.highspeed:"+car3.maxSpeed);
        System.out.println();
    }
}
