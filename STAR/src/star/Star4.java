package star;

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number");
        int num = scanner.nextInt();
        int i=1;
        int num2=num*2-1;
        while (i<=num2){
            for (int j = 0; j < (num2-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i+=2;
        }
    }
}
