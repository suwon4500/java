package chap08_1;

public class Calculation {
    int plus(int x, int y){
        return x+y;
    }

    double avg(int x, int y){
        double sum=plus(x,y);
        return sum/2;
    }

    void execute(){
        double result = avg(7,10);
        println("execution result:"+result);
    }

    void println(String message){System.out.println(message);}
}
