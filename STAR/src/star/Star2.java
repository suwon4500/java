/*
 * 2023-04-18
 * 채수원
 * 아래로
 */
package star;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number");
        int num = scanner.nextInt();
        int i=1;

        while(i<=num) {
            int j=1;
            while(j<=i) {
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i++;

        }
    }
}
