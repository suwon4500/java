package star;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number");
        int num = scanner.nextInt();
        int i=1;

        while (i<=num){
            for (int j = num; j > i ;j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}
