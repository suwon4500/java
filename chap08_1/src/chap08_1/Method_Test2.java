package chap08_1;

public class Method_Test2 {


    public static void main(String[] args) {
        Car myCar =new Car();
        myCar.setGas(5);

        boolean gasState=myCar.isLeftGas();
        if (gasState){
            System.out.println("car start.");
            myCar.run();
        }

        if (myCar.isLeftGas()){
            System.out.println("주유할필요 없다");
        }else System.out.println("주유해라");

        myCar.keyTrunOn();
        myCar.run2();
        int speed= myCar.getSpeed();
        System.out.println("current speed : "+speed+"km/h");
    }

}
