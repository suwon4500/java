package chap02;

import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args){
        /*
        double r =5.0;
        double pi = 3.14159;

        System.out.printf("�������� %f�� ���� ���̴� %f�Դϴ�.\n", r, pi*r*r);
        System.out.printf("�������� %e�� ���� ���̴� %e�Դϴ�.\n", r, pi*r*r);

        Scanner stdin = new Scanner(System.in); //Scanner ��ü ���� stdin
        System.out.print("�̸��� ����, �����Ը� ����(space)�� �����Ͽ� �Է�:");
        String name = stdin.next();
        int i = stdin.nextInt();
        double d = stdin.nextDouble();
        System.out.print(name + "���� ���̴�" + i + "���̰�\n�����Դ� " + d + "kg �Դϴ�.");
         */ //Scanner ����
        /*
        double a = (double)2;
        System.out.print(a);
        System.out.printf(" %.2f", a);
         */ //�Ҽ��� �Ʒ� ���Ĺ��� ����
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("�Ѱ��� ���ڸ� �Է� : ");
        int a = scanner.nextInt();
        boolean flag;
        flag = (a%2==0) ? true : false;
        System.out.print(a + "�� ¦���Դϱ�? : ");
        System.out.println(flag);
         */ // 3�� ������ Ȱ�� ����
        /*
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        System.out.println(grade>=90 ? "A���� ��� ����" : "���� ����");
         */ // 3�� ������ Ȱ�� ���� 2
        /*
        char c ='A';
        switch (c){
            case 'A':
            case 'B':
                System.out.println("���� ����");
            case 'C':
            case 'D':
                System.out.println("�����̳�");
         */ // switch case �� ����
        /*
        int sum=0;
        for (int i=1; i<=10; i++)
            sum+=i;
        System.out.println(sum);

        int a=0, b=0;
        for (a=1, b=10; a<b; a++,b--){
            System.out.println(a + b);
        }

         */ // for �����ϰ� ��� ����



    }
}
