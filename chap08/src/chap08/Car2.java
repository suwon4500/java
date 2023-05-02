package chap08;

public class Car2 {
    String company="BMW";
    String model;
    String color;
    int maxSpeed;

    //생성자1
    public Car2(){

    }
    //생성자2
    public Car2(String model){
        this.model=model;
    }
    //생성자3
    public Car2(String model, String color){
        this.model=model;
        this.color=color;
    }
    //생성자4
    public Car2(String model, String color, int maxSpeed){
        this.model=model;
        this.color=color;
        this.maxSpeed=0;
    }


}
