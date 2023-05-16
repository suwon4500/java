package chap08_1;

public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle myCalcu = new Rectangle();

        double result1=myCalcu.areaRectangle(10);
        double result2= myCalcu.areaRectangle(10,20);

        System.out.println("area of the regular square="+result1);
        System.out.println("area of the angled square="+result2);
    }
}
