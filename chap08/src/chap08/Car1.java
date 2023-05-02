package chap08;

public class Car1 {
    String company="BMW";
    String model;
    String color;
    int maxSpeed;

    //생성자1
    public Car1(){

    }
    //생성자2
    public Car1(String model){
        this.model=model;
    }
    //생성자3
    public Car1(String model, String color){
        this.model=model;
        this.color=color;
    }
    //생성자4
    public Car1(String model, String color, int maxSpeed){
        this.model=model;
        this.color=color;
        this.maxSpeed=0;
    }


}
