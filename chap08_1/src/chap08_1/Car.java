package chap08_1;

public class Car {
    int gas;
    int speed;

    void setGas(int gas){
        this.gas=gas;
    }

    boolean isLeftGas(){
        if (gas==0){
            System.out.println("no gas");
            return false;
        }
        System.out.println("has gas");
        return true;
    }

    void run(){
        while (true){
            if (gas>0){
                System.out.println("run.(remaining gas:"+gas+")");
                gas--;
            }else {
                System.out.println("stop.(remaining gas:"+gas+")");
                return;
            }
        }
    }

    int getSpeed(){return speed;}

    void keyTrunOn(){System.out.println("\n시동 켜짐");}

    void run2(){
        for (int i = 10; i <=50; i+=10){
            speed=i;
            System.out.println("run.(speed per hour:"+speed+"km/h)");
        }
    }

}
